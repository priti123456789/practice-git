package com.virtusa.model;





import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
public class Product  { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_id;
	private String product_name;
	
	  @Lob 
	  private byte[] image;
	 
	
	//@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	
	//@JoinColumn(name = "category_id")
	@Enumerated(EnumType.STRING)
	private Category categorie;

	private Integer product_qty;
	private String product_desc;
	private Float percentage_discount;
	private String stock_alert;
	private String stock_critical;
	private String comment;
	private Double product_price;

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * @return the product_id
	 */
	public Integer getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	/**
	 * @return the product_qty
	 */
	public Integer getProduct_qty() {
		return product_qty;
	}

	/**
	 * @param product_qty the product_qty to set
	 */
	public void setProduct_qty(Integer product_qty) {
		this.product_qty = product_qty;
	}

	/**
	 * @return the product_desc
	 */
	public String getProduct_desc() {
		return product_desc;
	}

	/**
	 * @param product_desc the product_desc to set
	 */
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	/**
	 * @return the percentage_discount
	 */
	public Float getPercentage_discount() {
		return percentage_discount;
	}

	/**
	 * @param percentage_discount the percentage_discount to set
	 */
	public void setPercentage_discount(Float percentage_discount) {
		this.percentage_discount = percentage_discount;
	}

	/**
	 * @return the stock_alert
	 */
	public String getStock_alert() {
		return stock_alert;
	}

	/**
	 * @param stock_alert the stock_alert to set
	 */
	public void setStock_alert(String stock_alert) {
		this.stock_alert = stock_alert;
	}

	/**
	 * @return the stock_critical
	 */
	public String getStock_critical() {
		return stock_critical;
	}

	/**
	 * @param stock_critical the stock_critical to set
	 */
	public void setStock_critical(String stock_critical) {
		this.stock_critical = stock_critical;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the product_price
	 */
	public Double getProduct_price() {
		return product_price;
	}

	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}

	public Category getCategory() {
		return categorie;
	}

	public void setCategory(Category categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}

	
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", categorie=" + categorie
				+ ", product_qty=" + product_qty + ", product_desc=" + product_desc + ", percentage_discount="
				+ percentage_discount + ", stock_alert=" + stock_alert + ", stock_critical=" + stock_critical
				+ ", comment=" + comment + ", product_price=" + product_price + "]";
	}

	
		
	}




/*
 * @DateTimeFormat(pattern = "dd/MM/yyyy")
 * 
 * @Temporal(TemporalType.TIME) private Date product_exp_date;
 */
