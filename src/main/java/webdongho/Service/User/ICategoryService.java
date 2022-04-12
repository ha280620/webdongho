package webdongho.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import webdongho.Dto.ProductsDto;

@Service
public interface ICategoryService {
	
	public List<ProductsDto> GetAllProductsByID(int id);
}
