package com.merc.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.merc.demo.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

	public abstract Optional<AppUser> findByUsername(String username);

	public abstract Optional<AppUser> findByUsernameIgnoreCase(String username);

}
