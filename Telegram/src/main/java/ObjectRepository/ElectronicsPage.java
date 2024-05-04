package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	public ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='page-title']/h1")
	private WebElement PageTitle;
	public WebElement getPageTitle() {
		return PageTitle;
	}
	public void setPageTitle(WebElement pageTitle) {
		PageTitle = pageTitle;
	}

	@FindBy(linkText="Camera, photo")
	private WebElement Cameraphoto;
	public WebElement getCameraphoto() {
		return Cameraphoto;
	}
	public void setCameraphoto(WebElement cameraphoto) {
		Cameraphoto = cameraphoto;
	}
	
}
