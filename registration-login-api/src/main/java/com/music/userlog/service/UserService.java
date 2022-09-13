package com.music.userlog.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.music.userlog.dto.UserRegistrationDto;
import com.music.userlog.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
