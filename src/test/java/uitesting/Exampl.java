package uitesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonmethods.Schot;
import objrep.Homepage;
import testbase.Browser;

public class Exampl extends Browser  {

	static SoftAssert sa= new SoftAssert();
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
		
		sa.assertTrue(true);
	}
	@Test 
	public static void poitemtext () throws InterruptedException, IOException {
		Thread.sleep(10000);
		 hp = new Homepage(driver);

		hp.popular_item().click();
		String acttbtext=hp.tablet_text().getText();
		if(acttbtext.contains("HP ELITEPAD")) {
			System.out.println("test pass");
			sa.assertTrue(true);

		}else {
			
			System.out.println("tesfail");
		}
		
		String actlptext=hp.laptop_text().getText();
		if(actlptext.contains("HP ELITEBOOK")) {
			
System.out.println("test pass");
sa.assertTrue(false);

			
		}else {
			
			System.out.println("tesfail");
		}
		
		
		String actsptext=hp.speaker_text().getText();
		if(actsptext.contains("HP ROAR PLUS")) {
			sa.assertTrue(false);
			Schot.screenshot();
System.out.println("test pass");
			
		}else {
			
			System.out.println("tesfail");
		}
		
sa.assertAll();		
	}
}
