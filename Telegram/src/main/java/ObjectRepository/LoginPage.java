package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  public LoginPage (WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
    @FindBy(xpath="//a[@class='ico-login']")
    private WebElement LoginLink;
    public WebElement getLoginLink() {
		return LoginLink;
	}
	public void setLoginLink(WebElement loginLink) {
		LoginLink = loginLink;
	}
	@FindBy(linkText= "Returning Customer")
    private WebElement Pagetitle;
    
    @FindBy(xpath="//input[@class='button-1 login-button']")
    private WebElement Loginbutton;
    
    @FindBy(id = "Email")
    private WebElement EmailTextField;
    
    @FindBy(id = "Password")
    private WebElement PasswordTextField;
    
    @ FindBy(linkText="Forgot password?")
    private WebElement ForgotpasswordLink;
    
    @FindBy(xpath="//input[@class='button-1 password-recovery-button']")
    private WebElement Recoverbutton;
    
	public WebElement getRecoverbutton() {
		return Recoverbutton;
	}
	public void setRecoverbutton(WebElement recoverbutton) {
		Recoverbutton = recoverbutton;
	}
	public WebElement getForgotpasswordLink() {
		return ForgotpasswordLink;
	}
	public void setForgotpasswordLink(WebElement forgotpasswordLink) {
		ForgotpasswordLink = forgotpasswordLink;
	}
	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	public void setEmailTextField(WebElement emailTextField) {
		EmailTextField = emailTextField;
	}
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	public void setPasswordTextField(WebElement passwordTextField) {
		PasswordTextField = passwordTextField;
	}
	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	public WebElement getPagetitle() {
		return Pagetitle;
	}
}
