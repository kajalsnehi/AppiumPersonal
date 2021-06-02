package com.bajajChetak.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.bajajChetak.pages.ChetakHomePage;
import com.bajajChetak.pages.ChetakLoginPage;
import com.qhl.base.Apputil;
import com.qhl.base.Webutil;

import io.appium.java_client.android.AndroidDriver;


public class HomePageTest extends Apputil  {
	ChetakHomePage home;
	static AndroidDriver<WebElement> driver;
	
	@BeforeClass
	//public void setup() throws MalformedURLException, InterruptedException

	public void bc() throws MalformedURLException, InterruptedException
	{
		//JSONObject jobj = Test_Data.Read_Data("config");
		driver=launch_apk("com.bajajmychetak", "com.bajajmychetak.MainActivity");
		Thread.sleep(3000);
		

	}


	@AfterMethod
	public void am(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String temp = Webutil.getScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),
					MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		extent.flush();
		driver.close();
	} 

@Test(priority=3)
	public void home() throws InterruptedException
	{
		home = new ChetakHomePage(driver);
		 
		logger = extent.createTest("As a user i should  be able perform all the actions for the vehicle");

		home.get_clickOnVehicle().click();
		Thread.sleep(3000);
		home.get_clickOnInformation().click();
		Thread.sleep(3000);
		home.get_clickOnBackBtn().click();
		Thread.sleep(3000);
		home.get_clickOnCrossBtn().click();
		Thread.sleep(3000);
		
	}

            



}
