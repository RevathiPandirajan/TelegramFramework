package com.TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;

public class RegisterTest {
	@Test(threadPoolSize = 3)
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcomePage = new WelcomePage(driver);
		RegisterPage registerPage =new RegisterPage(driver);
		//click on register link
		welcomePage.getRegisterLink().click();
		registerPage.getFemaleGenderButton().click();
		//Enter First name
		registerPage.getFirstNameTextField().sendKeys("Revathi");
		//Enter Lastname
		registerPage.getLastNameTextField().sendKeys("P");
		//Enter email
	
		registerPage.getEmailTextField().sendKeys("revathipandiaraj@gmail.com");
		//Enter password
		registerPage.getPasswordTextField().sendKeys("Rev@thi22");
		//enter confirm password
		registerPage.getCpwdTextField().sendKeys("Rev@thi22");
		//click on register button
		registerPage.getRegisterButton().click();
	}

}
