package com.virtusa.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	//@Temporal(TemporalType.TIME)
	/*
	 * @DateTimeFormat(pattern ="yyyy.mm.dd" )
	 */
	 @Temporal(TemporalType.DATE) 
	 
	private Date  date;
	private Long phoneNumber;
	private String address;
	private String role;
	private String gender;
	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@ElementCollection
	@JoinTable(name="user_product_tab",joinColumns = @JoinColumn(name="useridfk"),inverseJoinColumns = @JoinColumn (name="productidfk"))
	private Set<Product> products;
}
