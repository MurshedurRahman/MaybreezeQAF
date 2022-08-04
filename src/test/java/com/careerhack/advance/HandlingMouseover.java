package com.careerhack.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseover {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		
		WebElement img2 =driver.findElement(By.xpath("//img2[@alt='User Avatar'])[2]"));
		
		WebElement profile2 = driver.findElement(By.linkText("View profile"));
		
		Actions act = new Actions(driver);
		act.moveToElement(img2).moveToElement(profile2).click().build().perform();


	}
}
