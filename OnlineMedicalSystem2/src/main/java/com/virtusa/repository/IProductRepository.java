package com.virtusa.repository;

import java.util.List;
import java.util.Optional;

import com.virtusa.model.Product;

public interface IProductRepository {
	public Integer saveProduct(Product product);
    public List<Product> getAllProduct();
    //get product by id
    public Product getProductById(Integer id);
	public void deleteProduct(Integer id);
}
