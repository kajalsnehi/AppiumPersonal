package com.bajajChetak.Test;

import static org.testng.Assert.assertEquals;

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

public class LoginTest extends Apputil {
	ChetakLoginPage login;
	AndroidDriver<WebElement> driver;

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
		//driver.close();
	} 

	@Test(priority=1)
	public void login2() throws InterruptedException 
	{
		login = new ChetakLoginPage(driver);
		Thread.sleep(4000);

		logger=extent.createTest("At login screen each label should be proper");
		
		boolean a = login.get_username().isDisplayed();
		assertEquals(a,true);
		
		boolean b = login.get_password().isDisplayed();
		assertEquals(b, true);
		

	}

	@Test(priority=2)
	public void login1() throws InterruptedException
	{
		logger=extent.createTest("As a user i should  be able to login sucessfully");

		login.get_username().sendKeys("7758996563");
		Thread.sleep(3000);
		login.get_password().sendKeys("Bajaj@1234");
		login.get_signin().click();
		Thread.sleep(7000);
		login.get_clickOnAllowBtn().click();
		Thread.sleep(7000);

	}
	
	
	
	@Test(priority=3)
	public void home() throws InterruptedException
	{
		 
		logger = extent.createTest("As a user i should  be able perform all the actions for the vehicle");

		login.get_clickOnVehicle().click();
		Thread.sleep(3000);
		login.get_clickOnInformation().click();
		Thread.sleep(3000);
		login.get_clickOnBackBtn().click();
		Thread.sleep(3000);
		login.get_clickOnManageBtn().click();
		Thread.sleep(3000);
		//login.get_clickOnViewMyChetakbtn();
		//Thread.sleep(3000);
		
       }
       
       
}

