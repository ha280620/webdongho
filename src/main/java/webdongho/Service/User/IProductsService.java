package webdongho.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import webdongho.Dto.ProductsDto;

@Service
public interface IProductsService {
	public ProductsDto GetProductByID(long id);
	public List<ProductsDto> GetProductByIDCategory(int id);
}
