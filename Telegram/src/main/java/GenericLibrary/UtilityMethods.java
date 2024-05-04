package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityMethods {
	public static void getWebPageScreenshot(WebDriver driver)
{
		//step1
		TakesScreenshot ts = (TakesScreenshot) driver;
		//step2
		File temp =ts.getScreenshotAs(OutputType.FILE);
		//Step3
		File permanent = new File("./Screenshots/"+ getTime()+ ".png");
		//step4
		try {
			FileHandler.copy(temp,permanent);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();		
			}
		}
	
	
	
		}
	}
}
	




