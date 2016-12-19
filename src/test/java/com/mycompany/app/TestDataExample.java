package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestDataExample {
	private static final String NAME = "test";
	private DataExample dataExample;

	@Before
	public void setUp() throws Exception {
		dataExample = new DataExample(NAME);
	}

	@Test
	public void testDataExample() {
		assertEquals(NAME, dataExample.getName());
	}
}