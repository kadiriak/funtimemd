package com.fun.time.service;

import java.util.Optional;

import com.fun.time.model.User;

public interface IUserService {
	User saveUser(User user);

	Optional<User> findByUsername(String username);

	void makeAdmin(String username);
}
