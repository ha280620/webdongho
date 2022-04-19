package webdongho.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webdongho.Dao.UsersDao;
import webdongho.Entity.Users;

public class AccountServiceImpl implements IAccountService {
	@Autowired
	UsersDao usersDao = new UsersDao();
	
	pubic int AddAccount(Users user) {
		return usersDao.AddAccount(user);
	}

}
