package com.virtusa.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@NonNull
	private Integer id;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="cartItem" ,joinColumns = @JoinColumn(name="id") )
	@Column(name="product")
	Set<Product> product;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> products) {
		this.product = products;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", product=" + product + "]";
	}
	
}
