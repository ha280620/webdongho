package webdongho.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webdongho.Service.User.IProductsService;
import webdongho.Service.User.PaginateServiceImpl;

@Controller
public class ProductController extends BaseController{
	
	@Autowired
	private IProductsService _productService;
	
	@RequestMapping(value = { "chi-tiet-san-pham/{id}" })
	public ModelAndView Index(@PathVariable long id) {
		_mvShare.setViewName("user/products/product");
		_mvShare.addObject("product", _productService.GetProductByID(id));
		int idCategory = _productService.GetProductByID(id).getId_category();
		_mvShare.addObject("productByIDCategory", _productService.GetProductByIDCategory(idCategory));
		return _mvShare;
	}
}
