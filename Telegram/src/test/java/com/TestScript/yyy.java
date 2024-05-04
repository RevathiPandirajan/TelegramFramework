package com.TestScript;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class yyy {
	@Test(invocationCount = 5,threadPoolSize = 4,enabled =false)//priority=0(
	public void register()
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		//driver.get("hfhghghjg");
		driver.quit();
	}
	@Test(dependsOnMethods = "register")	//priority=1
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
		
	
	}
	@Test(dependsOnMethods = "login")  //priority=2
	public void addtocart() 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println();
		driver.quit();
	}
	@Test(dependsOnMethods = "addtocart")   //priority=3
	public void payment()
	{
	WebDriver driver = new ChromeDriver();
	System.out.println();
	driver.quit();
	}
	@Test(dependsOnMethods = "payment")   //priority=4
	public void confirmpayment()
	{
		WebDriver driver=new ChromeDriver();
		System.out.println();
		driver.quit();
	}

}
