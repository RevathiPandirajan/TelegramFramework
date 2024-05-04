package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	 public BooksPage (WebDriver driver) {
   	  PageFactory.initElements(driver,this);
   	  
     }
     
     @FindBy(xpath = "//div[@class='page-title']/h1")
     private WebElement pagetitle;
     public WebElement getPagetitle() {
		return pagetitle;
	}

	public void setPagetitle(WebElement pagetitle) {
		this.pagetitle = pagetitle;
	}

	@FindBy(id = "products-orderby")
     private WebElement Position;
     
     public WebElement getPosition() {
		return Position;
	}

	public void setPosition(WebElement position) {
		Position = position;
	}

	@FindBy(xpath = "//option[.='Price: High to Low']")
 	 private WebElement Hightolowoption;
     
     public WebElement getHightolowoption() {
		return Hightolowoption;
	}

     public WebElement getBook() {
		return book;
	}

	public void setFouroption(WebElement fouroption) {
		Fouroption = fouroption;
	}
   @FindBy(id ="products-pagesize")
   private WebElement DisplayPP;
   
   public WebElement getDisplayPP() {
	return DisplayPP;
}

public void setDisplayPP(WebElement displayPP) {
	DisplayPP = displayPP;
}

@FindBy(xpath = "//option[.='4']")
   private WebElement Fouroption;

   public WebElement getFouroption() {
	return Fouroption;
    }
   
 @FindBy(xpath = "//option[.='Name: Z to A']")
   private WebElement ZtoAoption;
 
 @FindBy(id="products-viewmode")
 private WebElement Viewoption;
 
 public WebElement getZtoAoption() {
	return ZtoAoption;
}

public void setZtoAoption(WebElement ztoAoption) {
	ZtoAoption = ztoAoption;
}

public WebElement getViewoption() {
	return Viewoption;
}

public void setViewoption(WebElement viewoption) {
	Viewoption = viewoption;
}

public WebElement getListoption() {
	return Listoption;
}

public void setListoption(WebElement listoption) {
	Listoption = listoption;
}

@FindBy(xpath = "//option[.='List']")
 private WebElement Listoption;
}











































