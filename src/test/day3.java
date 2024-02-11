package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day3 {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before executing any methods in the class");
	}	
	
	@AfterClass
	public void afterClass(){
		System.out.println("after executing all methods in the class");
	}
	
	@Parameters({"URL"})
	@Test (groups = {"Smoke"})
	public void WebLoginCarLoan(String urlname) {
		//selenium
		System.out.println("WebLoginCar");
		System.out.println(urlname);
	}
	
	@BeforeMethod
	public void BeforeEvery() {
		System.out.println("I will execute Before each test in Day3 class");
	}
	
	@AfterMethod
	public void AfterEvery() {
		System.out.println("I will execute After each test in Day3 class");
	}
	
	@Test(dependsOnMethods = {"WebLoginCarLoan"})
	public void MobileLoginCarLoan() {
		//appium
		System.out.println("MobileLoginCar");
	}
	
	@Test(timeOut = 4000)
	public void MobileLogOutCarLoan() {
		//appium
		System.out.println("MobileLogOutCar");
	}
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I am no 1");
	}
	
	@Test(enabled = false)
	public void LoginAPICarLoan() {
		//rest api automation
		System.out.println("ApiLoginCar");
	}
}
