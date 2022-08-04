package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// page object model--- is concept to make a web element 
	//and action on the web element reusable by creating methods
	
	//Page Factory-- technology to implement page object model
	
	
	WebDriver driver;
	
	HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		
		
	}

}
