package com.virtusa.repository;

import java.util.List;

import com.virtusa.model.Item;

public interface ICartRepository {
public Integer saveCartItem(Item item);

public List<Item> getAllCartItem();
	
}
