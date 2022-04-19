package com.virtusa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.virtusa.model.User;
import com.virtusa.repository.IUserRepository;
import com.virtusa.repository.UserRepositoryImpl;

@Service
public class UserServiceImpl implements IUserService {
@Autowired 
private IUserRepository repo;
	/**
 * @param repo the repo to set
 */
public void setRepo(UserRepositoryImpl repo) {
	this.repo = repo;
}

@Override
public Integer saveUser(User user) {
	Integer id=repo.saveUser(user);
	return id;
}

	@Override
	public void updateuser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(Integer Id) {
	repo.deleteUser(Id);

	}

	@Override
	public Optional<User> getOneUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> list=repo.getAllUsers();
		list.sort((ob1,ob2)->ob1.getId()-ob2.getId());
		return list;
	}

	@Override
	public Page<User> getAllUser(Pageable p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserExist(Integer Id) {
		
		return repo.isUserExist(Id);
	}

	@Override
	public boolean isUserExistByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteUser(Object object) {
		
		//repo.deleteUser(new User().getId());
		
	}

	@Override
	public User findUserByEmailOrMobileNoOrUserName(String loginData) {
		
		return repo.findUserByEmailOrMobileNoOrUserName(loginData);
	}


}
