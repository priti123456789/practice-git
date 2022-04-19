package com.virtusa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.virtusa.model.User;

public interface IUserService {
/**
 * 1.
 * take form data as input and return pk generated
 * 
 */
	     public Integer saveUser(User user);
	/**
	  * 2.
	  * take  edit data form input and update user
	  * 
	  */public void updateuser(User u);
	     
	  /**
	   * 
	   * 3
	   * take pk(Id) as input  and perform delete operation
	   * 
	   */
	     public void deleteUser(Object object);

/**4
 * provide id as input and returns one row as one input
 */
Optional<User> getOneUser(Integer id);

/**
 * 5
 * select all rows and give as list<User>
 * 
 */
public List<User> getAllUsers();
Page<User>getAllUser(Pageable p);

/**
 * take id as input if record exist return true else return false
 * 
 */
boolean isUserExist(Integer Id);

/**
 * take name as input , if record exist then return true else return false
 * 
 */ 
boolean isUserExistByName(String name);

void deleteUser(Integer Id);

/**
 * User Login
 */
public User findUserByEmailOrMobileNoOrUserName(String loginData);
}