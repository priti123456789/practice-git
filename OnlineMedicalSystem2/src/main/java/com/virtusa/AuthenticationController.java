package com.virtusa;

import java.util.List; 

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtusa.config.Constants;
import com.virtusa.model.User;
import com.virtusa.service.IUserService;
import com.virtusa.util.AuthenticationRequest;
@Controller
public class AuthenticationController {
	@Autowired
	private IUserService userService;
	private static Logger log=LoggerFactory.getLogger( AuthenticationController.class);

	// there will be two method for sign operation
	// one method will display
	// sign page
	// other method will get the authentication data
	@RequestMapping("/displaySignInPage")
	String signInPageMethod() {
		return "SignIn";
	}

	// this will receive data
	// @RequestParam
	// @PathVariable

	// object
	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public String signIn(AuthenticationRequest request,HttpServletResponse resp,HttpSession httpSession) {
		System.out.println("Login info " + request);
		log.info("Login info " + request);
		// return "signInPage";
		// }

		User userFromDB =  userService.findUserByEmailOrMobileNoOrUserName(request.getLoginCredentials());

		System.out.println("userFromDB-->"+ userFromDB);
		log.info("userFromDB-->"+ userFromDB);
		// login for Authentication
		if (userFromDB != null && !request.getPassword().equals(userFromDB.getPassword())) {
			return "signIn";
		}
		//cookies code
		
		Cookie userNameCookie =new Cookie("user",request.getLoginCredentials());
		userNameCookie.setMaxAge(24*60*60);
		resp.addCookie(userNameCookie);
		
		//before adding password into cookie hash the password
		Cookie passwordCookie =new Cookie("password",request.getPassword());
		passwordCookie.setMaxAge(24*60*60);
		resp.addCookie(passwordCookie);

		// code for httpSession
		httpSession.setAttribute("userData",userFromDB);

		// login for Authorization
		if(userFromDB!=null && userFromDB.getRole().equalsIgnoreCase(Constants.ROLE_ADMIN))
		{
			return "AdminDashBoard";
		}
		else if(userFromDB!=null && userFromDB.getRole().equalsIgnoreCase(Constants.ROLE_USER)) {
			return "CustomerDashBoard";
		}
		else if(userFromDB!=null && userFromDB.getRole().equalsIgnoreCase(Constants.ROLE_DEALER)) {
			return "Dealerindex";
		}
		return "SignIn";
	}
	/*-------------------------------------------------------for logout--------------------------------------*/
	@RequestMapping("/displaySignOutPage")
	public String logoutPage()
	{
		return "SignOut";
	}

	@RequestMapping("/logout/{value}")
	public String logout(@PathVariable String value , HttpServletResponse resp , HttpServletRequest request , HttpSession httpSession) {
		
		if("yes".equalsIgnoreCase(value))
		{
			// httpSession Object should delete
			httpSession.removeAttribute("userData");
			
			// delete cookies
			Cookie userNameCookie = new Cookie("user" , "");
			userNameCookie.setMaxAge(0);
			userNameCookie.setPath("/OnlineMedicalSystem2");
			resp.addCookie(userNameCookie);
			
			//before adding password into cookie hash the password
			Cookie passwordCookie = new Cookie("password" , "");
			passwordCookie.setPath("/OnlineMedicalSystem2");
			passwordCookie.setMaxAge(0);
			resp.addCookie(passwordCookie);
			
			
		}
		/*
		 * else { return "redirect: /OnlineMedicalSystem2"; }
		 */
		
		return "redirect: /OnlineMedicalSystem2";
	}

}
