package com.virtusa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor
@AllArgsConstructor
public enum Category {

	ANTIPYRETICS,
    ANALGESICS,
	ANTIMALARIAL,
    ANTISEPTICS,
	ANTISEP;
 
	//Category(){}
	
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	private Integer category_id;
	
private String category;
 

//@OneToMany(mappedBy ="categorie",targetEntity =Product.class,cascade = CascadeType.ALL )
//private List<Product> product;

public String getCategory() {
	return category;
}

public Integer getCategory_id() {
	return category_id;
}


public void setCategory_id(Integer category_id) {
	this.category_id = category_id;
}


	
	// public List<Product> getProduct() 
	// { return product; }
	 
	 
	// public void setProduct(List<Product> product)
	// { this.product = product; }
	 
/**
 * @param category the category to set
 */
public void setCategory(String category) {
	this.category = category;
}
}


