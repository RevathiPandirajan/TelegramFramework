package com.TestScript;

import org.testng.annotations.Test;
import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.BooksPage;
import ObjectRepository.LoginPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;

public class zdemowebshop
{
	@Test(groups = {"smoke","Functional"})
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
	@Test
       public void test2()
       {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcomePage = new WelcomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		//click on login link
        loginPage.getLoginLink().click();
		//Enter email
		loginPage.getEmailTextField().sendKeys("revathipandiaraj@gmail.com");
		//Enter password
		loginPage.getPasswordTextField().sendKeys("Rev@thi22");
		//click on login button
		loginPage.getLoginbutton().click();
       }
       @Test
	public void test3()
	{ 
    	WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://demowebshop.tricentis.com/");
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		
   		WelcomePage welcomePage = new WelcomePage(driver);
   		LoginPage loginPage = new LoginPage(driver);
   		
      	//click on login link
        loginPage.getLoginLink().click();
		//Enter email
		loginPage.getEmailTextField().sendKeys("revathipandiaraj@gmail.com");
   		//click forgot password link
		loginPage.getForgotpasswordLink().click();
		//enter email for password recovery
		loginPage.getEmailTextField().sendKeys("revathipandiaraj@gmail.com");
		//click recover button
		loginPage.getRecoverbutton().click();
		
	}
	@Test
       public void test4()
       {
		WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://demowebshop.tricentis.com/");
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		
   		WelcomePage welcomePage =new WelcomePage(driver);
   		BooksPage booksPage= new BooksPage(driver);
   		//click on Books link
   		welcomePage.getBooksLink().click();
   		
   		//Click  on position dropdown
   		booksPage.getPosition().click();
   		//click on high to low option
   		booksPage.getHightolowoption().click();
   		
   		//Click on display dropdown
   		booksPage.getDisplayPP().click();
   		//Click on option 4
   		booksPage.getFouroption().click();
 
       }
	@Test
	public void test5()
	{
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomePage =new WelcomePage(driver);
		BooksPage booksPage= new BooksPage(driver);
	   //click on Books link
		welcomePage.getBooksLink().click();
		//Click  on position dropdown
		booksPage.getPosition().click();
		//click on Z to A option
   		booksPage.getZtoAoption().click();
   		//Click on view dropdown
   		booksPage.getViewoption().click();
   		//Click on Listoption
   		booksPage.getListoption().click();
   		
		
		
   	
		
	}
	
   
       
}
	 
       
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    