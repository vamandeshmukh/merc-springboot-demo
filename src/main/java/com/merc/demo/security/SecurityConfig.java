//package com.merc.demo.security;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfig {
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	@Bean
//	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
//		LOG.info(encoder.toString());
//
//		UserDetails admin = User.withUsername("admin").password(encoder.encode("pass")).roles("ADMIN", "USER").build();
//		UserDetails user = User.withUsername("user").password(encoder.encode("pass")).roles("USER").build();
//
//		return new InMemoryUserDetailsManager(admin, user);
//	}
//
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		LOG.info(http.toString());
////		return http.build();
//
//		return http.csrf().disable()
//				//
//				.authorizeHttpRequests().requestMatchers("/hi", "/hello").permitAll()
//				//
//				.and().authorizeHttpRequests().requestMatchers("/api/**").authenticated()
//				//
//				// add this for actuator
//				.and().authorizeHttpRequests().requestMatchers("/actuator/**").permitAll()
//				//
//				.and().formLogin()
//				//
//				.and().build();
//
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		LOG.info("passwordEncoder");
//		return new BCryptPasswordEncoder();
//	}
//
//}
//
////package com.merc.demo.security;
////
////import org.slf4j.Logger;
////import org.slf4j.LoggerFactory;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.core.userdetails.User;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.password.PasswordEncoder;
////import org.springframework.security.provisioning.InMemoryUserDetailsManager;
////import org.springframework.security.web.SecurityFilterChain;
////
////@Configuration
////@EnableWebSecurity
////@EnableMethodSecurity
////public class SecurityConfig {
////
////	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
////
////	@Bean
////	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
////		LOG.info(encoder.toString());
////
////		UserDetails admin = User.withUsername("admin").password(encoder.encode("pass")).roles("ADMIN", "USER").build();
////		UserDetails user = User.withUsername("user").password(encoder.encode("pass")).roles("USER").build();
////
////		return new InMemoryUserDetailsManager(admin, user);
////	}
////
////	@Bean
////	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////		LOG.info(http.toString());
//////		return http.build();
////
////		return http.csrf().disable()
////				//
////				.authorizeHttpRequests().requestMatchers("/hi", "/hello").permitAll()
////				//
////				.and().authorizeHttpRequests().requestMatchers("/api/**").authenticated()
////				//
////				// add this for actuator
////				.and().authorizeHttpRequests().requestMatchers("/actuator/**").permitAll()
////				//
////				.and().formLogin()
////				//
////				.and().build();
////
////	}
////
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////		LOG.info("passwordEncoder");
////		return new BCryptPasswordEncoder();
////	}
////
////}
