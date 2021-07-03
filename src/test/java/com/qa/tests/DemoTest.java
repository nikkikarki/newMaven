package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum(){
		System.out.println("sum");
		int a= 6;
		int b= 4;
		Assert.assertEquals(10, a+b);
	}
	@Test
	public void sub(){
		int a= 6;
		int b= 4;
		Assert.assertEquals(2, a-b);
		}
}
