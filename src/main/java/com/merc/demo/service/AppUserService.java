package com.merc.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.merc.demo.model.AppUser;
import com.merc.demo.repository.AppUserRepository;

@Service
public class AppUserService implements IAppUserService {

	@Autowired
	private AppUserRepository appUserRepository;

	public AppUser getUserByUsername(String username) {
		Optional<AppUser> userOpt = appUserRepository.findByUsername(username);
		if (userOpt.isPresent())
			return userOpt.get();
		throw new UsernameNotFoundException(username);
	}

	public AppUser addUser(AppUser appUser) {
		if (this.getUserByUsername(appUser.getUsername()).getUsername().equalsIgnoreCase(appUser.getUsername())) {
//			throw new UserAlreadyExistsException(); // create this class and update global exception handler 
			throw new RuntimeException("Username already exists!");
		}
		return appUserRepository.save(appUser);
	}

}
