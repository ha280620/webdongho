package webdongho.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webdongho.Dao.CategorysDao;
import webdongho.Dao.MenuDao;
import webdongho.Dao.ProductsDao;
import webdongho.Dao.SlidesDao;
import webdongho.Dto.ProductsDto;
import webdongho.Entity.Categorys;
import webdongho.Entity.Menus;
import webdongho.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categoryDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productsDao;

	
	public List<Slides> GetDataSlide() {
		// TODO Auto-generated method stub
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		return categoryDao.GetDataCategorys();
	}
	
	public List<Menus> GetDataMenus() {
		return menuDao.GetDataMenus();
	}

	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		listProducts.get(0).getId_color();
		return listProducts;
	}
}
