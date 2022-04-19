package com.virtusa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtusa.model.Item;
import com.virtusa.model.Product;
import com.virtusa.service.ICartService;
import com.virtusa.service.IProductService;

@Controller
@RequestMapping()
public class CartController {
	@Autowired
IProductService service;
	
@Autowired
ICartService cartservice ;
	
	/*
	 * public CartController(ICartService cartservice) { super(); this.cartservice =
	 * cartservice; }
	 */

	@RequestMapping(value = "product/{product_id}", method = RequestMethod.GET)
	public void buy(@PathVariable("product_id")Integer product_id,Model model ) {
	//	String page;
		System.out.println(" Cart product id is:"+ product_id);
		Product prod=service.getOneProductById( product_id);
		System.out.println("cart product are"+prod);
		Set<Product> products=new HashSet();
		products.add(prod);
		Item item=new Item();
		item.setProduct(products);
		System.out.println(item);
		System.out.println(cartservice);
	Integer id=	 cartservice.addCartItem(item);
		
		System.out.println("In Cart Module");
			//Pitem.roduct prod=opt.get();
			//model.addAttribute("msg","product"+ product_id +"is save successfully in cart");
			
		
			//return"redirect:CustomerCartItem";
	
}
	
	//2- get All cart itemGet
	@GetMapping("/customerCartItem")
	public String  getAllCartitem(Model model){
		List<Item> item=cartservice.getAllCartItem();
		model.addAttribute("item", item);
		System.out.println("The  Customer Cart Items are::"+item);
		return "CustomerCartItem";
	}
}