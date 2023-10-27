//package com.merc.demo.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Configuration;
//
//// aspect oriented programming 
//@Configuration
//@Aspect
//public class EmployeeInterceptor {
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	@Before("execution(* com.merc.demo.service.*.*(..))")
//	public void serviceLog() {
//		LOG.info("A method from a service class invoked.");
//	}
//
//	@Before("execution(* com.merc.demo.service.*.*(..))")
//	public void serviceLogWithData(JoinPoint obj) {
//		LOG.info(obj.getSignature().toString());
//	}
//
//	@AfterThrowing("execution(* com.merc.demo.service.*.*(..))")
//	public void exceptionThrown(JoinPoint obj) {
//		for (Object arg : obj.getArgs())
//			LOG.info(arg.toString());
//	}
//
//	@After("execution(* com.merc.demo.service.*.*(..))")
//	public void serviceLog2() {
//		LOG.info("After a method from a service class invoked.");
//	}
//
//}
