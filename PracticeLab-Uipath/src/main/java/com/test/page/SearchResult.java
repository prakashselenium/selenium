package com.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.projectspecificmethods.ProjectSpecificMethods;

public class SearchResult extends ProjectSpecificMethods{
	
	public void validateResult() {
		WebElement findCountry = driver.findElement(By.xpath("//table//tbody//tr[2]/td[5]"));
		System.out.println(findCountry.getText());
	}

}
