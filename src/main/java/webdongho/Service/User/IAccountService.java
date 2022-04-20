package webdongho.Service.User;

import java.util.HashMap;

import webdongho.Entity.Users;

public interface IAccountService {
	public int AddAccount(Users user);
	public Users CheckAccount(Users user);
}
