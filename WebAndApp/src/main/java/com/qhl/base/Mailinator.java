package com.qhl.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Mailinator {
	
	@FindBy(id = "addOverlay")
	public WebElement search_fld;

	@FindBy(xpath = "//button[contains(text(),'GO')]")
	public WebElement go_btn;

	@FindBy(xpath = "//td[4]//a[contains(text(),'Reset Password')][1]")
	public WebElement reset_pwd_lnk;

	@FindBy(id = "msg_body")
	public static WebElement msg_frame;


	public static String get_OTP(String email) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\COMMUNITYx\\Exe\\Chrome_driver_latest.exe");
		WebDriver w_driver = new ChromeDriver();
		w_driver.manage().window().maximize();
		w_driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		w_driver.get("https://www.mailinator.com/");
		w_driver.findElement(By.id("addOverlay")).sendKeys(email);
		w_driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
		Thread.sleep(3000);
		//w_driver.findElement(By.xpath("//tr[1]//td[4]//a[contains(text(),'Forgot Password OTP')]")).click();
		w_driver.findElement(By.xpath("//tr//td[4]//a[contains(text(),'OTP')]")).click();
		// switch into message frame
		w_driver.switchTo().frame(0);
		String message = w_driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]")).getText();
		String otp = message.replaceAll("\\D", "");
		w_driver.close();
		return otp;

	}

}