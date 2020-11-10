package commonmethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import testbase.Browser;

public class Schot extends Browser  {
	
//static WebDriver driver;
	public static void screenshot() throws IOException {
		
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		 File scrsht= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scrsht, new File("D:\\errorsc12.png"));
		 
		
	}

}
