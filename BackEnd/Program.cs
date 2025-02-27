using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Options;
using PBL6.Services.Service;
using PBL6.Services.ServiceImpl;
using PBL6_BackEnd.Config;
using PBL6_BackEnd.Services.Service;
using PBL6_BackEnd.Services.ServiceImpl;
using PBL6_QLBH.Data;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllersWithViews();
builder.Services.AddScoped<IVnPayService, VnPayService>();

builder.Services.AddScoped<IMomoService, MomoService>();
builder.Services.AddScoped<IOrderDetailService, OrderDetailService>();
builder.Services.AddScoped<IOrderService, OrderService>();
builder.Services.AddScoped<ITransactionService, TransactionService>();
builder.Services.AddScoped<IProductService,ProductService>();
builder.Services.AddScoped<IPromotionService, PromotionService>();


builder.Services.Configure<ZaloPayConfig>(builder.Configuration.GetSection(ZaloPayConfig.ConfigName));
builder.Services.AddSingleton(resolver => resolver.GetRequiredService<IOptions<ZaloPayConfig>>().Value);
builder.Services.AddDbContext<DataContext>(options =>
{
    options.UseSqlServer(builder.Configuration.GetConnectionString("MyDB"));
});

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.Run();
