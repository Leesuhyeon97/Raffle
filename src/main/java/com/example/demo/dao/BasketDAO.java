package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.BasketVO;

@Mapper
@Repository
public interface BasketDAO {
	
	public void insertBasket(BasketVO basketVO) throws DataAccessException;
	public int selectQuantityBySpcode(BasketVO basketVO) throws Exception;
	public void updateQuantityBySpcode(BasketVO basketVO) throws DataAccessException;
	public List<BasketVO> selectAllProductById(String id) throws DataAccessException;
	}
