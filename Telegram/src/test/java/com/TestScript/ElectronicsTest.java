package com.TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.ElectronicsPage;
import ObjectRepository.WelcomePage;

public class ElectronicsTest {
	@Test
	public void ElectronicsTest()
	
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WelcomePage welcomePage=new WelcomePage(driver);
			ElectronicsPage electronicsPage=new ElectronicsPage(driver);
			//ClicK on electronics link
			welcomePage.getElectronicsLink().click();
			//Click on cameraphoto link
			electronicsPage.getCameraphoto().click();		
		}
	

}
