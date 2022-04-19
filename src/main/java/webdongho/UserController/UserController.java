package webdongho.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import webdongho.Entity.Users;
import webdongho.Service.User.AccountServiceImpl;

@Controller
public class UserController extends BaseController {
	
	AccountServiceImpl accountService = new AccountServiceImpl();
	
	@RequestMapping(value= "/dang-ky", method = RequestMethod.GET)
	public ModelAndView Register() {
		_mvShare.setViewName("user/account/register");
		_mvShare.addObject("user", new Users());
		return _mvShare;
	}
	
	@RequestMapping(value= "/dang-ky", method = RequestMethod.POST)
	public ModelAndView CreateAcc(@ModelAttribute("user") Users user) {
		int count = accountService.AddAccount(user);
		if(count > 0) {
			_mvShare.addObject("status", new Users());
		}else {
			_mvShare.addObject("status", new Users());
		}
		return _mvShare;
	}
}
