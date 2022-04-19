package com.virtusa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.virtusa.model.DealerProduct;
import com.virtusa.model.Product;
import com.virtusa.repository.ProductDao;

@Controller
public class DealerController {

	@Autowired
	private ProductDao productDao;
	@RequestMapping("/dealerdashboard")
	public String homePage() {
		return "Dealerindex";
	}


	@RequestMapping("/getAllDealerProducts")
	public String home(Model m) {

		List<DealerProduct>products = productDao.getProducts();
		m.addAttribute("products", products);

		return "AllDealerProduct";
	}

	// show add product form
	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}

//	handle add product form
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	//public RedirectView handleProduct(@ModelAttribute DealerProduct product, HttpServletRequest request) {
	public String save(@ModelAttribute DealerProduct product, HttpServletRequest request) {	
	System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		//redirectView.setUrl(request.getContextPath() + "/");
		//return redirectView;
		return "Dealerindex";
	} 

	// delete handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		this.productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int pid,Model model)
	{
		DealerProduct product = this.productDao.getProduct(pid);
		model.addAttribute("product", product);
		return "update_form";
	}
	
}
