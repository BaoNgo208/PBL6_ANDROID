using PBL6_QLBH.Models;

namespace PBL6.Services.Service
{
    public interface IProductService
    {
        public IQueryable<Product> getAllProduct();
    }
}
