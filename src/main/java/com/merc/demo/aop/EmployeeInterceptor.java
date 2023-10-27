package com.merc.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// aspect oriented programming 
@Configuration
@Aspect
public class EmployeeInterceptor {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.merc.demo.service.*.*(..))")
	public void serviceLog() {
		LOG.info("A method from a service class invoked.");
	}

}
