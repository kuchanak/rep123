package commonmethods;

import com.aventstack.extentreports.ExtentReports;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {
	
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	static ExtentTest test;
	
	public static void setup() {
	 extent = new ExtentReports();
	 spark= new ExtentSparkReporter("target/Spark.html");
	extent.attachReporter(spark);
	 test=extent.createTest("advtest");
	
}
	
	
	
	public static void repopass() {
		
		
	test.pass("test is pass");
	
	extent.flush();
		
		
	}
	
	public static void repofail() {
		
		
	test.fail("test is failed ");
	
	String path="D:\\\\errorsc12.png";
	test.addScreenCaptureFromPath(path);
		extent.flush();
		
	}

}
