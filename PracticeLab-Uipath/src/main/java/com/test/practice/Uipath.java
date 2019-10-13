package com.test.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.test.projectspecificmethods.ProjectSpecificMethods;

public class Uipath extends ProjectSpecificMethods{
	
	public void findCompany(String userName,String password,String vendorName) throws InterruptedException {
			
	driver.get("https://acme-test.uipath.com/account/login");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.id("email")).sendKeys(userName);
	
	driver.findElement(By.id("password")).sendKeys(password);
	
	driver.findElement(By.id("buttonLogin")).click();
	
	Thread.sleep(2000);
	
	Actions Ac = new Actions(driver);
	
	WebElement vendor =driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[4]"));
	
	Ac.moveToElement(vendor).click().perform();

	Thread.sleep(2000);
	WebElement searchVendor = driver.findElement(By.linkText("Search for Vendor"));
	
	Ac.moveToElement(searchVendor).click().perform();
	
	driver.findElement(By.id("vendorName")).sendKeys(vendorName);
	
	driver.findElement(By.id("buttonSearch")).click();
	
	Thread.sleep(2000);
	
	WebElement findCountry = driver.findElement(By.xpath("//table//tbody//tr[2]/td[5]"));
	
	System.out.println(findCountry.getText());
	
	}
	
}
