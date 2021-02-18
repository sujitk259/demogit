/*Author SUjit Kumar*/

package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchSpicejet {

	
	 @Test
		public void webDriverManagerChrome()
		{
		 	ChromeOptions chromeoptions=new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeoptions);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
				
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("https://www.spicejet.com/");
	         }
	}

