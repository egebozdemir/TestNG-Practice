package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL","APIKey"})
	@Test
	public void WebLoginHomeLoan(String urlname, String key) {
		//selenium
		System.out.println("WebLoginHome");
		System.out.println(urlname);
		System.out.println(key);

	}
	
	@Test
	public void MobileLoginHomeLoan() {
		//appium
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void MobileSignUpHomeLoan() {
		//appium
		System.out.println("MobileLoginHome");
	}
	
	@Test (groups = {"Smoke"})
	public void MobileLogoutHomeLoan() {
		//appium
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void LoginApiHomeLoan() {
		//rest api automation
		System.out.println("ApiLoginHome");
	}
}
