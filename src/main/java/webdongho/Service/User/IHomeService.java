package webdongho.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webdongho.Dto.ProductsDto;
import webdongho.Entity.Categorys;
import webdongho.Entity.Menus;
import webdongho.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categorys> GetDataCategorys();
	public List<Menus> GetDataMenus();
	public List<ProductsDto> GetDataProducts();
}
