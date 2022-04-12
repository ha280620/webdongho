package webdongho.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webdongho.Dto.PaginatesDto;
import webdongho.Service.User.CategoryServiceImpl;
import webdongho.Service.User.PaginateServiceImpl;

@Controller
public class CategoryController extends BaseController {
	
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Autowired
	private PaginateServiceImpl paginateService;
	
	private int totalProductPage = 9;
	
	@RequestMapping(value ="/san-pham/{id}")
	public ModelAndView Product(@PathVariable String id) {

		_mvShare.setViewName("user/products/category");	
		int totalData = categoryService.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductPage, 1);
		_mvShare.addObject("idCategory",id);
		_mvShare.addObject("paginateInfo",paginateInfo);
		_mvShare.addObject("productsPaginate",categoryService.GetDataProductsPaginate(Integer.parseInt(id),paginateInfo.getStart(), totalProductPage));
		return _mvShare;
	}
	
	
	
	@RequestMapping(value ="/san-pham/{id}/{currentPage}")
	public ModelAndView Product(@PathVariable String id, @PathVariable String currentPage) {
		_mvShare.setViewName("user/products/category");	
		int totalData = categoryService.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductPage, Integer.parseInt(currentPage));
		_mvShare.addObject("idCategory",id);
		_mvShare.addObject("paginateInfo",paginateInfo);
		_mvShare.addObject("productsPaginate",categoryService.GetDataProductsPaginate(Integer.parseInt(id) ,paginateInfo.getStart(), totalProductPage));
		return _mvShare;
	}
	
	
	
	
}
