package com.lti.demos;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

	@Test
	void testExceptions() {
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{Integer.parseInt("one");}
		);
	}
	@Test
	void testmethodexp() {
		Calculator c=new Calculator();
		final Exception e=assertThrows(ArithmeticException.class,
				()->{c.searchEmp(0);});
	}
}
