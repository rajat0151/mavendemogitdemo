package com.lti.demos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

	Calculator c= new Calculator();
	
	@Test
	public void testSayHello() {
		Assertions.assertEquals("Hello world",c.sayHello());
	}
}
