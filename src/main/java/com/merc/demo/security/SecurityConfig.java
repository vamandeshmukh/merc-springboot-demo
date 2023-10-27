package com.merc.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {

		UserDetails admin = User.withUsername("admin").password("pass").roles("ADMIN", "USER").build();
		UserDetails user = User.withUsername("user").password("pass").roles("USER").build();

		return new InMemoryUserDetailsManager(admin, user);
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//		return http.build();

		return http.csrf().disable()
				//
				.authorizeHttpRequests().requestMatchers("/hi").permitAll()
				//
				.and().authorizeHttpRequests().requestMatchers("/hello").permitAll()
				//
				.and().authorizeHttpRequests().requestMatchers("/api/**").authenticated()
				//
				.and().formLogin()

				//
				.and().build();

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
