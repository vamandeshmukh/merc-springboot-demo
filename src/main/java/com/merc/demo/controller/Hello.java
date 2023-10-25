package com.merc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("hello")
	public String hello() {
		System.out.println("hello");
		return "Hello world!";
	}

	@RequestMapping("hi")
	public String hi() {
		System.out.println("hi");
		return "Hi! How are you?";
	}

}
