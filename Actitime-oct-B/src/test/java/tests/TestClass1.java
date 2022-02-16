package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestClass1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suit TestClass1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test TestClass1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class TestClass1");

	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method TestClass1");
    
	}
	
	@Test
	public void testA() {
		System.out.println("test A TestClass1");
	
	}
	
	@Test
	public void testB() {
		System.out.println("test B TestClass1");
	
	}	
		
	@Test
	public void testC() {
		System.out.println("test C TestClass1");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method TestClass1");
	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class TestClass1");
	
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("after test TestClass1");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suit TestClass1");
	}
}


