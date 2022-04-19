package com.virtusa.service;

import java.util.List;

import com.virtusa.model.Item;

public interface ICartService {
public Integer addCartItem(Item item);
public List<Item> getAllCartItem();
}
