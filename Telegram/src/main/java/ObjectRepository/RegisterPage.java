package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
   @FindBy( xpath="//div[@class='page-title']/h1")
   private WebElement  pagetitle;

public WebElement getPagetitle() {
	return pagetitle;
}
  

@FindBy(id = "gender-male")
private WebElement MaleGenderButton;
@FindBy(id = "gender-female")
private WebElement FemaleGenderButton;
@FindBy(id = "FirstName")
private WebElement FirstNameTextField;
@FindBy(id = "LastName")
private WebElement LastNameTextField;
@FindBy(id = "Email")
private WebElement EmailTextField;
@FindBy(id = "Password")
private WebElement PasswordTextField;
@FindBy(id = "ConfirmPassword")
private WebElement cpwdTextField;
@FindBy(id = "register-button")
private WebElement registerButton;

public WebElement getMaleGenderButton() {
	return MaleGenderButton;
}
public void setMaleGenderButton(WebElement maleGenderButton) {
	MaleGenderButton = maleGenderButton;
}
public WebElement getFemaleGenderButton() {
	return FemaleGenderButton;
}
public void setFemaleGenderButton(WebElement femaleGenderButton) {
	FemaleGenderButton = femaleGenderButton;
}
public WebElement getFirstNameTextField() {
	return FirstNameTextField;
}
public void setFirstNameTextField(WebElement firstNameTextField) {
	FirstNameTextField = firstNameTextField;
}
public WebElement getLastNameTextField() {
	return LastNameTextField;
}
public void setLastNameTextField(WebElement lastNameTextField) {
	LastNameTextField = lastNameTextField;
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
public WebElement getCpwdTextField() {
	return cpwdTextField;
}
public void setCpwdTextField(WebElement cpwdTextField) {
	this.cpwdTextField = cpwdTextField;
}
public WebElement getRegisterButton() {
	return registerButton;
}
public void setRegisterButton(WebElement registerButton) {
	this.registerButton = registerButton;
}
public void setPagetitle(WebElement pagetitle) {
	this.pagetitle = pagetitle;
}
   
}
