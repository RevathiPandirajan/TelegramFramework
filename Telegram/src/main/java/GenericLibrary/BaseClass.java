package GenericLibrary;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ObjectRepository.LoginPage;
import ObjectRepository.WelcomePage;

public class BaseClass extends UtilityMethods{
	public WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	@BeforeSuite
	public void bsuite()
	{
		report=new Ext
		System.out.println("Before suite");
	}
	@BeforeTest
	public void btest() {
		System.out.println("Before test");
			}
	
	@BeforeClass
	public void launchBrowser() {
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 System.out.println("Before class");
		 }
	@BeforeMethod
	 public void login() {
		WelcomePage welcomePage=new WelcomePage(driver);
		LoginPage loginPage=new LoginPage(driver);
		welcomePage.getLoginLink().click();
		loginPage.getEmailTextField().sendKeys("revathipandiaraj@gmail.com");
		loginPage.getPasswordTextField().sendKeys("REv@thi22");
		loginPage.getLoginbutton().click();
		System.out.println("Before method");
	}
	
	
	@AfterSuite
	public void asuite() {
		System.out.println("After Suite");
		
	}
	@AfterTest
	public void atest()
	{
		System.out.println("After test");
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
		System.out.println("After class");
	}
	@AfterMethod
	public void logout()
	{
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.getLogoutLink().click();
		System.out.println("After Method");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


