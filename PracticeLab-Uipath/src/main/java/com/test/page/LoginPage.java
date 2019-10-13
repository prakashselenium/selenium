package com.test.page;

import org.openqa.selenium.By;

import com.test.projectspecificmethods.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage enterEmail(String username) {
		driver.findElement(By.id("email")).sendKeys(username);;
		return this;
	}
	
	public LoginPage enterPassword(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;
	}
	
	public DashboardPage Login() {
		driver.findElement(By.id("buttonLogin")).click();
		return new DashboardPage();
	}
	
}
