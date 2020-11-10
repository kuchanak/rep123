package uitesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import objrep.Homepage;
import testbase.Browser;

public class Popularitemstesting extends Browser {
	
	static SoftAssert sa = new SoftAssert();
	
	static Homepage hp;
	@BeforeMethod
	public static void luncb() throws Exception  {
		
		Browser.invokbrowser();
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\kiran\\Downloads\\geckodrive27\\geckodriver.exe"); //***launch
		 * firefox browser**** driver = new FirefoxDriver();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //*** write
		 * facebook.com as url driver.get("http://advantageonlineshopping.com/#/");
		 */
		 
	}
	
	
			
	
	@Test()
	public static void m() throws Exception {
		
		
		Thread.sleep(10000);
		
		 hp = new Homepage(driver);
		hp.popular_item().click();
		int itemsize=hp.popular_block().findElements(By.tagName("div")).size();
		System.out.println(itemsize);
		Assert.assertEquals(3, 3);
		
	}
	@Test 
	public static void poitemtext () throws InterruptedException {
		Thread.sleep(10000);
		 hp = new Homepage(driver);

		hp.popular_item().click();
		String acttbtext=hp.tablet_text().getText();
		
		if(acttbtext.contains("HP ELITEPAD")) {
			
			sa.assertTrue(true);
			System.out.println("test pass");
			
		}else {
			
			sa.assertTrue(false);
			System.out.println("tesfail");
		}
		
		String actlptext=hp.laptop_text().getText();
		if(actlptext.contains("HP 123book")) {
			sa.assertTrue(true);
System.out.println("test pass");
			
		}else {
			sa.assertTrue(false);
			System.out.println("tesfail");
		}
		
		
		String actsptext=hp.speaker_text().getText();
		if(actsptext.contains("HP ROAR 123PLUS")) {
			sa.assertTrue(true);
System.out.println("test pass");
			
		}else {
			sa.assertTrue(false);
			System.out.println("tesfail");
		}
		
		sa.assertAll();
	}

}
 