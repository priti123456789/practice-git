package com.virtusa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.model.Item;
import com.virtusa.repository.ICartRepository;
@Service
public class ICartServiceimpl implements ICartService{
@Autowired
ICartRepository repo;
	@Override
	public Integer addCartItem(Item item) {
		// TODO Auto-generated method stub
		return repo.saveCartItem(item);
	}
	@Override
	public List<Item> getAllCartItem() {
		
		return repo.getAllCartItem();
	}

}
