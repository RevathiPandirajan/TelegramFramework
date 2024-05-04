package com.TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepository.BooksPage;
import ObjectRepository.WelcomePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BooksTest {

	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcomePage=new WelcomePage(driver);
		BooksPage booksPage=new BooksPage(driver);
		//Click on Bookslink
		welcomePage.getBooksLink().click();
		String actualresult=booksPage.getPagetitle().getText();
		//Hard Assert
		//Assert.assertEquals(actualresult, "Computers");
		SoftAssert soft=new SoftAssert();
		Assert.assertEquals(actualresult, "Books");
		//soft.assert)
		//verify bookspage is displayed
		//if(booksPage.getBook().getText().equals("Books"))
		//{
		//System.out.println("Test case pass");
	    //}
	    //else {
	    //System.out.println("Test case fail");
		//}
		driver.quit();
		soft.assertAll();
		}
	}


