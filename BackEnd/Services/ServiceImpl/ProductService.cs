using Microsoft.EntityFrameworkCore;
using PBL6.Services.Service;
using PBL6_QLBH.Data;
using PBL6_QLBH.Models;

namespace PBL6.Services.ServiceImpl
{
    public class ProductService : IProductService
    {
        private readonly DataContext _context;
        public ProductService(DataContext context)
        {
            _context = context;
        }
        public IQueryable<Product> getAllProduct()
        {
            return _context.Products.AsQueryable(); // Trả về IQueryable để áp dụng Skip và Take
        }
    }
}
