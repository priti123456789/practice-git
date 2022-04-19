package com.virtusa;

import java.util.List;

import org.apache.log4j.Layout;
import org.apache.log4j.PatternLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtusa.model.User;
import com.virtusa.service.IUserService;

@Controller
public class AdminController {
	@Autowired
	private IUserService service;

private static  Logger log= LoggerFactory.getLogger(AdminController.class);
Layout layout=new PatternLayout(); 
	// 1. show admin dash board page
	@GetMapping("/dashboard")
	public String showDashBoard() {
		return "AdminDashBoard";
	}

	@PostMapping("/save")
	public String readData(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String date, @ModelAttribute User user,
			Model model) {
		//System.out.println(user);
		log.info("User are::"+user);
		/*
		 * SimpleDateFormat formatter=new SimpleDateFormat ("mm-dd-yyyy");,
		 * formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
		 */

		Integer id = service.saveUser(user);
		String msg = "user" + id + "registered successfully";
		model.addAttribute("msg", msg);
		return "UserRegister";
	}

	// 2 show user  register form
	@GetMapping("/show")
	public String showRegPage() {
		
		log.info("entered into register message");
		return "UserRegister";
	}

	/**
	 * on click submit button (Register)read form data and save in data base
	 * sendsucess messgae to ui
	 * 
	 * @param user
	 * @param model
	 * @return
	 */
	/*
	 * @PostMapping("/addUser") public String saveUser(@ModelAttribute User user,
	 * Model model) { System.out.println(user); Integer uid=service.saveUser(user);
	 * //construct success msg String msg="User"+uid+" is saved successfully";
	 * //send msg to ui model.addAttribute("msg", msg);
	 * 
	 * return "UserRegister";
	 * 
	 * }
	 */

	// 3.show all user data
	@GetMapping("/showdata")
	public String showData(Model model) {
		// fetching data from service
		List<User> list = service.getAllUsers();
		model.addAttribute("list", list);
		log.info("user list");
		//System.out.println(list);
		log.info("user are::"+list);
		return "UserData";

	}

	// 4 delete user record
	//@PostMapping("/delete")
	@GetMapping("/delete")
	public String deleteUser(@RequestParam(name = "id",required = false ) Integer id,Model model ){
log.info("user is going to deleated");
		boolean rel = service.isUserExist(id);
	//	System.out.println(id);
		log.info("id::");
		// System.out.println(rel);
		if (service.isUserExist(id)) {
			service.deleteUser(id);
		}
		 else { // logger.warn("unable to perform delete operation");
			 log.warn("unable to perform delete operation");
		 System.out.println("unable to perform delete operation"); }
		 log.info("unable to perform delete operation");
		List<User> list = service.getAllUsers();
		model.addAttribute("list", list);
		// String msg="user"+id +"is deleted successfully";
		// model.addAttribute("message", msg);
		return "redirect:showdata";
	}

	//custome product page
	/*@GetMapping("/customerCartItem")
	public String customeCartItems() {
	return "CustomerCartItem";*/
}
