package webdongho.UserController;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import webdongho.Service.User.HomeServiceImpl;
@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	public ModelAndView _mvShare = new ModelAndView();
	
	@PostConstruct // chay init truoc
	public ModelAndView Init () {
		_mvShare.addObject("menus", _homeService.GetDataMenus());
		return _mvShare;
	}
}
