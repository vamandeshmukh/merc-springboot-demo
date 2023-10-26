package com.merc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("hello")
	public String hello() {
		LOG.info("hello");
		return "Hello world!";
	}

	@RequestMapping("hi")
	public String hi() {
		LOG.info("hi");
		return "Hi! How are you?";
	}

}
