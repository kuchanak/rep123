package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import commonmethods.Propfile;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Browser {
	public static WebDriver driver;
	
	public static  void invokbrowser() throws Exception {
		
		String url=Propfile.getprovalue("url");
		String browser=Propfile.getprovalue("browser");
		
		//String browser="firefox";
		if(browser.equalsIgnoreCase("chrome")) {
			

			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			 driver = new FirefoxDriver();
			
		} else if (browser.equalsIgnoreCase("ie")) {
			
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(url);
		
	}
		

}
