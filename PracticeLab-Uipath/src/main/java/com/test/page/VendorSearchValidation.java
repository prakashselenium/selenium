package com.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.projectspecificmethods.ProjectSpecificMethods;

public class VendorSearchValidation extends ProjectSpecificMethods{
	
	public SearchResult searchVendor(String VendorName) throws InterruptedException {
		driver.findElement(By.id("vendorName")).sendKeys(VendorName);;
		driver.findElement(By.id("buttonSearch")).click();
		Thread.sleep(2000);
		
		WebElement findCountry = driver.findElement(By.xpath("//table//tbody//tr[2]/td[5]"));
		
		System.out.println(findCountry.getText());
		return new SearchResult();
	}

}
