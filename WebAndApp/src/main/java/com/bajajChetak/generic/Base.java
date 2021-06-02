package com.bajajChetak.generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Base {
	
	public static AndroidDriver<WebElement> driver;
	//public static AppiumDriverLocalService service;
	public static void main(String[] args) throws MalformedURLException, InterruptedException{}
	

		public static AndroidDriver<WebElement> launch_apk(String apk_package, String apk_activity) throws InterruptedException, MalformedURLException {
			MutableCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			dc.setCapability("appPackage", apk_package);
			dc.setCapability("appActivity", apk_activity);
			URL url = new URL("http://127.0.0.1:4723/wd/hub");// this is the Appium server path
			driver = new AndroidDriver<WebElement>(url, dc);
			Thread.sleep(5000);
			return driver;
			}
	
		public static String timestamp() {
			return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date(0));
			
		}
	
		
	}


