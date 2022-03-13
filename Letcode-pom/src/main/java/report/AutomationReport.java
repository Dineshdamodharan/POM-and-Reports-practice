package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {
public static void main(String[] args) {
	// actual report
    ExtentReports extent = new ExtentReports();
	//blank template
    ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html");
     // attach 
    extent.attachReporter(reporter);
    // create test
    ExtentTest test = extent.createTest("TC001-searchproduct");
    test.pass("enter the desired result");
    test.pass("check if the product i lited");
    test.pass("add the product to cart");
    // test 2
   ExtentTest test2 = extent.createTest("TC002-payment");
   test2.pass("navigate to the paymentpage");
   test2.fail("payment failed",
		   MediaEntityBuilder
		   .createScreenCaptureFromPath("img.png")
		   .build());
   //save report
   extent.flush();
   
    
    
    
    
}
}
