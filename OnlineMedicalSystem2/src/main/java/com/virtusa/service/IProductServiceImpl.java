package com.virtusa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.exception.UserNotFoundException;
import com.virtusa.model.Product;
import com.virtusa.repository.IProductRepository;

@Service
public class IProductServiceImpl implements IProductService {
	@Autowired
	private IProductRepository repo;

	@Override
	public Integer saveProduct(Product product) {
		return repo.saveProduct(product);

	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return repo.getAllProduct();
	}

	@Override
	public Product getOneProductById(Integer id) {
		
		Product  opt= repo.getProductById(id);
	//	if(opt.empty() != null)
		//{
		//	throw new UserNotFoundException("Product not found with this "+id);
	//	}
		return opt;
		
		}

	@Override
	public void deleteProduct(Integer id) {
		System.out.println("product is oing to deleted");
		repo.deleteProduct(id);;
		
	}
	}


