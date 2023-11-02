package com.merc.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration // add this 
class AppTests {

	@Test
	void testTest() {
		Assertions.assertEquals(10, 5 + 5);
	}

	@Test
	void testTestN() {
		Assertions.assertNotEquals(10, 5 + 6);
	}
}

// testAddEmployee
