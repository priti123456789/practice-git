package com.virtusa.service;

import java.util.List;
import java.util.Optional;

import com.virtusa.model.Product;

public interface IProductService {
	public Integer saveProduct(Product product);
   public List< Product> getAllProduct();
   public Product getOneProductById(Integer id);
public void deleteProduct(Integer id);
   
}
