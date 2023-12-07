package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01LocateByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.name("txtCustomerID"));
		userName.sendKeys("tiya@gmail.com");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("Tiya@123");
		
		WebElement logIn = driver.findElement(By.name("Butsub"));
		logIn.click();
		
		
	}

}
