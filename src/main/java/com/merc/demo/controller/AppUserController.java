package com.merc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.merc.demo.model.AppUser;
import com.merc.demo.service.IAppUserService;

@RestController
@RequestMapping("api")
//@CrossOrigin(origins = "3000")
//@CrossOrigin(origins = { "3000", "4200" })
@CrossOrigin(origins = "*")
public class AppUserController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	IAppUserService appUserService;

	// create another method with username and password for login
	@RequestMapping(path = "get-user-by-username/{username}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<AppUser> getuserByUsername(@PathVariable(name = "username") String username) {
		LOG.info("abc");
		AppUser appUser = appUserService.getUserByUsername(username);
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "User found successfully.");
		ResponseEntity<AppUser> response = new ResponseEntity<AppUser>(appUser, headers, status);
		LOG.info("xyz");
		return response;
	}

	// use for register
	@RequestMapping(path = "add-user", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<AppUser> addUser(@RequestBody /* @Valid */ AppUser appUser) {
		AppUser appUserObj = appUserService.addUser(appUser);
		HttpStatus status = HttpStatus.CREATED;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "User created successfully.");
		ResponseEntity<AppUser> response = new ResponseEntity<AppUser>(appUserObj, headers, status);
		LOG.info(appUser.toString());
		return response;
	}

}
