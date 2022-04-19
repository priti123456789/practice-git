package com.virtusa;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.virtusa.model.Category;
import com.virtusa.model.Product;
import com.virtusa.model.User;
import com.virtusa.service.IProductService;



@Controller
public class ProductController {
	
	@Autowired
	private IProductService service;
	private static Logger log=LoggerFactory.getLogger(ProductController.class);
	
	//show add product page 
	@GetMapping("/addProduct")
	 public String showProductAddForm(Model model) {
		 List< Category> categiries = Arrays.asList( Category.values());
		 categiries.forEach(
				  category ->
				  { System.out.println(category); });
		 
	    System.out.println(categiries);
		model.addAttribute("product",new Product());
	    model.addAttribute("category", categiries);
		/*
		 * for(Category s:categiries) { System.out.println(s); }
		 */
//	    Category[] categories = Category.class.getEnumConstants();
//	    System.out.println( categories);
	  
		
		 
	   
		 return "AddProduct";
		 
	 }

	
	//2.  on click submit button product add is on  database
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product, Model model ) {
	//System.out.println(	product.getImage().getSize());
	//System.out.println(product.getImage().getContentType());
	byte[] data=product.getImage();

	
		//byte[] contents = file.getBytes();
	//	Blob blob = new SerialBlob(data);
		product.setImage(data);


		System.out.println();
		
		Integer id=service.saveProduct(product);
		String msg="product"+id+"is saved .";
		model.addAttribute("msg",msg);
		System.out.println("product"+id+"is saved .");
		return  "AddProduct";
		
	}
	
	
	//3. get all product  available 
	@GetMapping("/getAllProduct")
	public String getAllProduct(Model model) {
		try {
		Class clazz=Class.forName("com.virtusa.model.Category");
		//get constructor for loaded class
		Constructor<?> cons[]=clazz.getDeclaredConstructors();
		//get access to private constructor
		cons[0].setAccessible(true);
		cons[1].setAccessible(true);
		}
		catch(Exception e) {
			System.out.println("enum constructore are private ");
			e.printStackTrace();
			
		}
		
		List<Product> product=service.getAllProduct();
		System.out.println(product);
		model.addAttribute("product",product);
		return "AllProduct";
		
		
	}
	
	
	
	@GetMapping("/searchProductInGoogle")
	public String searchProductGoogle() {
		return "SearchProduct";
	}

//4 web app gateway redirect 
@GetMapping("/search")
 public RedirectView searchProduct(@RequestParam("querybox")String query)
 {
	String url="https://www.google.com/search?q="+query;
	RedirectView redirectView=new RedirectView();
	redirectView.setUrl(url);
	return redirectView;
	 }
//5 add medicine pictures
@GetMapping("/addmedicine")
public String addMedicinePictures() {
	return "AddMedicinePictures";
}
// save medicine pictue in server
@PostMapping("/savemedicine")
public String saveMedicinePicture(@RequestParam("image") CommonsMultipartFile file,HttpSession s,Model m) {
	System.out.println("file uploaded successfully");
	System.out.println(file.getSize());
	System.out.println(file.getName());
	System.out.println(file.getContentType());
	System.out.println(file.getStorageDescription());
	byte[] data=file.getBytes();
	String path=s.getServletContext().getRealPath("/") +"WEB-INF"+File.separator+"images"+File.separator+file.getOriginalFilename();
	System.out.println(path);
	try {
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(data);
		System.out.println("file uploaded successfully");
		m.addAttribute("msg","uploaded successfully");
		m.addAttribute("filename",file.getOriginalFilename());
		
		fos.close();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("uploading error");
		m.addAttribute("msg","uploading error");
	}
	return "FileUploadSuccess";
	
	
}

//show allproduct for admin
@GetMapping("/getAllProductforAdmin")
public String getAllProductforAdmin(Model model) {
	try {
	Class clazz=Class.forName("com.virtusa.model.Category");
	//get constructor for loaded class
	Constructor<?> cons[]=clazz.getDeclaredConstructors();
	//get access to private constructor
	cons[0].setAccessible(true);
	cons[1].setAccessible(true);
	}
	catch(Exception e) {
		System.out.println("enum constructore are private ");
		e.printStackTrace();
		
	}
	
	List<Product> product=service.getAllProduct();
	System.out.println(product);
	model.addAttribute("product",product);
	return "ShowAllProductForAdimn";
	
	
}

//delete product
@GetMapping("/deleteProduct")
public String deleteProduct(@RequestParam(name = "product_id",required = false ) Integer id,Model model ){
log.info("product is going to deleated");
	//boolean rel = service.isProductExist(id);
	System.out.println(id);
	// System.out.println(rel);
	//if (service.isProductExist(id)) {
		service.deleteProduct(id);
	
	// else { // logger.warn("unable to perform delete operation");
		 //log.warn("unable to perform delete operation");
	 //System.out.println("unable to perform delete operation"); }
	 
	//List<User> list = service.getAllUsers();
	//model.addAttribute("list", list);
	// String msg="user"+id +"is deleted successfully";
	// model.addAttribute("message", msg);
	return "redirect:getAllProductforAdmin";
}
}