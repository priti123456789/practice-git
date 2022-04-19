package com.virtusa; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	//
	@GetMapping("/customerDashBoard")
	public String customerDashBoardPage()
	{
		return " CustomerDashBoard";
	}

}
