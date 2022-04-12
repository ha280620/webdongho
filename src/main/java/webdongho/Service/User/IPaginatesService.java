package webdongho.Service.User;

import org.springframework.stereotype.Service;

import webdongho.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	
	public PaginatesDto GetInfoPaginate (int totalData, int limit,int currentPage);

}
