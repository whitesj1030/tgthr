package com.thoughtmechanix.authentication.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.thoughtmechanix.authentication.model.User;

public interface UserService extends UserDetailsService{
	User save(User user);
}
