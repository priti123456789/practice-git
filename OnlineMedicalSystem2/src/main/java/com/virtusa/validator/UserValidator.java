package com.virtusa.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.virtusa.model.User;
@Component
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
	System.out.println("UserValidation.vlidate(-,-)");
	User user=null;
	//type casting of command classs
	user=(User)target;
	if(user.getFirstName()==null||user.getFirstName().isEmpty()) {
		errors.rejectValue("firstName", "user.firstName.required");
	}
	else if(user.getFirstName().length()<5 || user.getFirstName().length()>10) {   //length
		errors.rejectValue("firstName","user.firstName.length");
	}
	
	if(user.getLastName()==null ||  user.getLastName().isEmpty()) {   //required rule
		errors.rejectValue("lastName","user.lastName.required");
	}
	else if(user.getLastName().length()<5 || user.getLastName().length()>10) {   //length
		errors.rejectValue("lastname","user.lastName.length");
	}
	
	if(user.getEmail()==null ) {   //required rule
		errors.rejectValue("email","user.email.required");
	}
	else if(user.getGender()==null|| user.getGender().isEmpty()) {   //length
		errors.rejectValue("gender","user.gender.required");
	}
	else if(user.getPassword()==null|| user.getPassword().isEmpty()) {   //length
		errors.rejectValue("password","user.password.required");
	}
	else if(user.getPassword().length()<4|| user.getPassword().length()>8) {   //length
		errors.rejectValue("password","user.password.range");
	}
	else if(user.getPhoneNumber().MAX_VALUE>10&&user.getPhoneNumber().MIN_VALUE<10) {   //length
		errors.rejectValue("phoneNumber","user.phoneNumber.length");
	
}//method
		
	}

}