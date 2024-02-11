package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups = {"Smoke"})
	public void Demo() {
		System.out.println("Hello World!");	
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first");
	}
	
	@AfterTest
	public void postrequisite() {
		System.out.println("I will execute last");
	}
}
