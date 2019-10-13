package com.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.test.projectspecificmethods.ProjectSpecificMethods;

public class DashboardPage extends ProjectSpecificMethods{
	
	public VendorSearchValidation clickVendor() throws InterruptedException {
		
		WebElement vendor =driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[4]"));
		
		Actions Ac = new Actions(driver);
		Ac.moveToElement(vendor).click().perform();

		Thread.sleep(2000);
		WebElement searchVendor = driver.findElement(By.linkText("Search for Vendor"));
		
		Ac.moveToElement(searchVendor).click().perform();
		
		return new VendorSearchValidation();
	}

}
