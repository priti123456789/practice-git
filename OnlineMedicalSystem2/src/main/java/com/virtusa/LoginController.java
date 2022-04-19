package com.virtusa;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.config.Constants;
import com.virtusa.model.User;
import com.virtusa.service.IUserService;

@Controller
public class LoginController {
	@Autowired
	private IUserService userService;
	private static Logger log=LoggerFactory.getLogger(LoginController.class);
	
	 @RequestMapping("/signUP") 
	 public String signUPPage() { 
		 return "SignUp"; }
	 
	
	@RequestMapping("/")
	String entryPoint(HttpServletRequest request,HttpServletResponse response) 
	{
			System.out.println("Entry point of project");
			String userCred="";
			String password="";
			// for http session and cookies  //
			/*---------------------------------------------------------
			 * ------------------------------------------------
			 * ---------------------*/
		
			HttpSession httpSession=request.getSession();
			User userFromSession=(User) httpSession.getAttribute("userdata");
			log.info("user session  is"+userFromSession);
			System.out.println(userFromSession);
	   
			//if session doesn't have user Object return to dashboard directly
	 		//else check for the role and return to dashboard
	 		
			if(userFromSession!=null)
			{
				if(userFromSession!=null&& userFromSession.getRole().equalsIgnoreCase(Constants.ROLE_ADMIN))
					{
						return "AdminDashBoard";
					}
				else  if(userFromSession!=null&& userFromSession.getRole().equalsIgnoreCase(Constants.ROLE_USER))
					{
						return "CustomerDashBoard";
					}
				else  if(userFromSession!=null&& userFromSession.getRole().equalsIgnoreCase(Constants.ROLE_DEALER))
				{
					return "Dealerindex";
				}
		   }
			/*--------------------------------
			 * -------------------------------------
			 * -----------------------------------------*/
			else
			{
				Cookie[] cookies=request.getCookies();
				if(cookies!=null)
				{
					for(Cookie cookie:cookies)
					{
						//System.out.println(cookie.getName()+" "+cookie.getValue());
						log.info("cookie"+cookie.getName()+" "+cookie.getValue());
						//confusing line
						if(cookie.getName().equals("user"))
						{
							userCred=cookie.getValue();
						}
						else if(cookie.getName().equals("password"))
						{
							password=cookie.getValue();
						}
					}
				
			
			//get object from dataBase and check for authorization and authentication
				if(userCred.length()>0 && password.length()>0)
				{
					User userFromDB =userService.findUserByEmailOrMobileNoOrUserName(userCred);
					httpSession.setAttribute("userData",userFromDB);
		   
					if(userFromDB!=null && userFromDB.getRole().equalsIgnoreCase(Constants.ROLE_ADMIN))
					{
						return "AdminDashBoard";
					}
					else if(userFromDB!=null && userFromDB.getRole().equalsIgnoreCase(Constants.ROLE_USER))
					{
					return "CustomerDashBoard";
					}
					else if(userFromDB!=null && userFromDB.getRole().equalsIgnoreCase(Constants.ROLE_DEALER))
					{
					return "Dealerindex";
					}
				}
				return "Home";
	    }
			}
			return "Home";
	}


}
