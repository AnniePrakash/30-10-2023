package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample {
	
	
	@BeforeClass
	
	private void tc01() {
		
		System.out.println("Before Class")
	}
	
	@AfterClass
	
	private void tc3() {
		
		System.out.println("After Class");
	}
	
	@Test(priority=2,enabled=false)
	
	private void tc5() {
		
		System.out.println("Test");
	}
	
	@BeforeMethod
	
	private void tc2() {
		
		System.out.println("Before Method");
	}
	
	@AfterMethod
	
	private void tc6() {
		
		System.out.println("After Method");
	}
	

	@Test(priority=1,invocationCount=3)
	
	private void tc8() {
		
		System.out.println("Test 2");
	}
	

	@Test(priority=3)
	
	private void tc7() {
		
		System.out.println("Test  3");
	}
	
	

}
