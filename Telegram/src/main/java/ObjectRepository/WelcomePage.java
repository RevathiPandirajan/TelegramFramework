package ObjectRepository;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
          public WelcomePage (WebDriver driver) {
        	  PageFactory.initElements(driver,this);
        	  
          }
          
          @FindBy(linkText = "Books")
          private WebElement booksLink;

          
          @FindBy(linkText = "Register")
          private WebElement RegisterLink;
          
          @FindBy(linkText ="Log in")
          private WebElement LoginLink;
          
          @FindBy(linkText="Electronics")
          private WebElement ElectronicsLink;
          
          @FindBy(linkText="Log out")
          private WebElement LogoutLink;
          
          
         
		
          public WebElement getLogoutLink() {
			return LogoutLink;
		}

		public void setLogoutLink(WebElement logoutLink) {
			LogoutLink = logoutLink;
		}

		public WebElement getElectronicsLink() {
			return ElectronicsLink;
		}

		public void setElectronicsLink(WebElement electronicsLink) {
			ElectronicsLink = electronicsLink;
		}

		public WebElement getLoginLink() {
			return LoginLink;
		}

		public void setLoginLink(WebElement loginLink) {
			LoginLink = loginLink;
		}

		public WebElement getRegisterLink() 
		{
			return RegisterLink;
		}
		
          public WebElement getBooksLink()
		{
			return booksLink;
				
		}
          
          
}

