package com.merc.demo.service;

import com.merc.demo.model.AppUser;

public interface IAppUserService {
	public AppUser getUserByUsername(String username);

	public AppUser addUser(AppUser appUser);

}
