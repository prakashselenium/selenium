package com.test.testcase;

import com.test.projectspecificmethods.ProjectSpecificMethods;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.page.*;

public class VendorSearch extends ProjectSpecificMethods{
	
@BeforeTest
	
   public void setData() {
     excelFileName="Book1";
    	}

@Test(dataProvider="fetchdata")

public void validateVendorSearch(String UserName,String Password,String VendorName) throws InterruptedException {
	
	new LoginPage().enterEmail(UserName).enterPassword(Password).Login();
	
	new DashboardPage().clickVendor();
	
	new VendorSearchValidation().searchVendor(VendorName);
	
	new VendorSearchValidation();
	
      }


  }
