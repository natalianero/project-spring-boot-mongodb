package com.natalianero.projectmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natalianero.projectmongo.domain.User;
import com.natalianero.projectmongo.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}