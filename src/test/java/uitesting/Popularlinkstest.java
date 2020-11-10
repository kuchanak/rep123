package uitesting;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import commonmethods.Exceldata;
import commonmethods.Extentreport;
import commonmethods.Schot;
import objrep.Homepage;
import testbase.Browser;

public class Popularlinkstest extends Browser{

	@BeforeTest
	public static void esetup() {
		
		Extentreport.setup();
	}
	
	
	static Homepage hp;
	@BeforeMethod
	public static void invokebro() throws Exception {
		Browser.invokbrowser();
	
		
	}
	@AfterMethod
	public static void closeb() {
		driver.close();
	}
	
	@Test
	public static void tablet() throws InterruptedException, IOException {
	Thread.sleep(20000);
		hp = new Homepage(driver);
		hp.popular_item().click();	
		hp.tablet_link().click();
		String actualtext_table=hp.table_decp_text().getText();
		System.out.println(actualtext_table);
		
		
		if(actualtext_table.contains(Exceldata.readdata(3, 0))) {
			
			System.out.println("test id pass");
			Exceldata.writedata(3, 1, "valid data");
			Extentreport.repopass();
			
			
		}else {
			Schot.screenshot();
			System.out.println("test id fail");
			Exceldata.writedata(3, 1, "in valid data");
			Extentreport.repofail();
		}
		
		
		
		
	}
	
	@Test
	public static void alaptop() throws InterruptedException, IOException {
		Thread.sleep(20000);
WebDriverWait wait = new WebDriverWait(driver, 20);
		hp = new Homepage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(hp.popular_item()));
		hp.popular_item().click();
		Thread.sleep(10000);
		hp.laptop_link().click();
		String actualtext_laptop=hp.laptop_decp_text().getText();
		System.out.println(actualtext_laptop);
		
if(actualtext_laptop.contains(Exceldata.readdata(1, 0))) {
			
			System.out.println("test id pass");
			Exceldata.writedata(1, 1, "valid data");
			Extentreport.repopass();
			
		}else {
			Schot.screenshot();

			System.out.println("test id fail");
			Exceldata.writedata(1, 1, "in valid data");
			Extentreport.repofail();
		}
		
		
	}
	
 @Test
	public static void spekr() throws InterruptedException, IOException {
		Thread.sleep(20000);

	 hp = new Homepage(driver);
		hp.popular_item().click();
		hp.speaker_link().click();
		String actualtext_spe=hp.spe_decp_text().getText();
		
		System.out.println(actualtext_spe);
		
if(actualtext_spe.contains(Exceldata.readdata(2, 0))) {
			
			System.out.println("test id pass");
			Exceldata.writedata(2, 1, "valid data");
			Extentreport.repopass();
			
		}else {
			Schot.screenshot();

			System.out.println("test id fail");
			Exceldata.writedata(2, 1, "in valid data");
			Extentreport.repofail();
		}

		
}
}
