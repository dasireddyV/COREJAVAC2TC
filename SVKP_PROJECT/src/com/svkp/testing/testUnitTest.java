package com.svkp.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testUnitTest {
	String str1="hello";
	String str2=new String("hello");

	@Test
	void test() {
		assertEquals(str1,str2);
	}

}
