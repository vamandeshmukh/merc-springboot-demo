package com.merc.demo.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merc.demo.model.AppUser;
import com.merc.demo.repository.AppUserRepository;

@Service
public class AppUserService implements IAppUserService {

	@Autowired
	private AppUserRepository appUserRepository;
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public AppUser getUserByUsername(String username) {
		LOG.info(username);
		Optional<AppUser> userOpt = appUserRepository.findByUsername(username);
		if (userOpt.isPresent())
			return userOpt.get();
//		return null;
		throw new RuntimeException(username);
	}

	public AppUser addUser(AppUser appUser) {
		LOG.info(appUser.toString());
		Optional<AppUser> userOpt = appUserRepository.findByUsername(appUser.getUsername());
		if (userOpt.isPresent() && (userOpt.get().getUsername().equals(appUser.getUsername()))) {
//			throw new UserAlreadyExistsException(); // create this class and update global exception handler 
			throw new RuntimeException("Username already exists!");
		}
		return appUserRepository.save(appUser);
	}

}
