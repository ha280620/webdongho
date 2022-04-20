package webdongho.Service.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webdongho.Dao.BillsDao;
import webdongho.Dto.CartDto;
import webdongho.Entity.BillDetail;
import webdongho.Entity.Bills;

@Service
public class BillsServiceImpl implements IBillsService {
	@Autowired
	private BillsDao billsDao;
	
	public int AddBills(Bills bill) {
		return billsDao.AddBills(bill);
	}
	
	long idBills = billsDao.GetIDLastBills();
	
	public void AddBillsDetail(HashMap<Long, CartDto> carts) {
		for(Map.Entry<Long, CartDto> itemCart : carts.entrySet()) {
			BillDetail billDetail = new BillDetail();
			billDetail.setId_bills(idBills);
			billDetail.setId_product(itemCart.getValue().getProduct().getId_product());
			billDetail.setQuantity(itemCart.getValue().getQuantity());
			billDetail.setTotal(itemCart.getValue().getTotalPrice());
			billsDao.AddBillsDetail(billDetail);
		}
	}
}
