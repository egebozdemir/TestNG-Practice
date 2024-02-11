package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void Demo() {
		System.out.println("Hello World!");
		Assert.assertTrue(false); //to make it failed
	}
	
	@Test (groups = {"Smoke"})
	public void SecondTest() {
		System.out.println("Hello World!");
	}
	
	@AfterSuite
	public void Bfsuite() {
		System.out.println("I am no 1 from the last");
	}
	
}
