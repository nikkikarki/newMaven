package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void mul(){
		System.out.println("mul");
		int a= 6;
		int b= 4;
		Assert.assertEquals(24, a*b);
	}
	@Test
	public void div(){
		int a= 6;
		int b= 2;
		Assert.assertEquals(3, a/b);
		}
}
