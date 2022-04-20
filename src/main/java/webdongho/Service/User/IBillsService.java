package webdongho.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import webdongho.Dto.CartDto;
import webdongho.Entity.Bills;

@Service
public interface IBillsService {
	public int AddBills(Bills bill);
	
	public void AddBillsDetail(HashMap<Long, CartDto> carts);
	

}
