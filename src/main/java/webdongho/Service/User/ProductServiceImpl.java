package webdongho.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webdongho.Dao.ProductsDao;
import webdongho.Dto.ProductsDto;
@Service
public class ProductServiceImpl implements IProductsService {
	@Autowired
	ProductsDao productDao = new ProductsDao();

	public ProductsDto GetProductByID(long id) {
		List<ProductsDto> listProducts = productDao.GetProductByID(id);
		 	
		return listProducts.get(0);
	}

	public List<ProductsDto> GetProductByIDCategory(int id) {
		return productDao.GetAllProductsByID(id);
	}

}
