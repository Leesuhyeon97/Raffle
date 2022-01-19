package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.binding.BindingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BasketDAO;
import com.example.demo.vo.BasketVO;

@Service
public class BasketService {
	@Autowired
	BasketDAO basketDAO;
	
	public List<BasketVO> insertBasket(BasketVO basketVO) throws Exception {
		try {
			int i=basketDAO.selectQuantityBySpcode(basketVO);
			if(i==0) {
				basketDAO.insertBasket(basketVO);
			}else {
				basketVO.setQuantity(++i);
				basketDAO.updateQuantityBySpcode(basketVO);
			}			
			
		}catch(BindingException e) {
			System.out.println(e.getMessage());
			basketDAO.insertBasket(basketVO);
			
		}
		
		return basketDAO.selectAllProductById(basketVO.getId());
	}

}
	

