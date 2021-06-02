package com.bajajChetak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ChetakHomePage {

	@FindBy(xpath = ("//android.widget.ImageView[@bounds='[216,483][1224,1167]']"))
	private WebElement clickOnVehicle;
	@FindBy(xpath = ("//android.view.ViewGroup[@bounds='[72,1282][1368,1446]']"))
	private WebElement clickOnInformation;
	@FindBy(xpath = ("//android.view.ViewGroup[@bounds='[1216,589][1368,741]']"))
	private WebElement clickOnBackBtn;
	@FindBy(id=("//android.view.ViewGroup[@bounds='[118,642][146,698]']"))
	private WebElement clickOnCrossBtn;
	
	public ChetakHomePage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement get_clickOnVehicle() {
		return clickOnVehicle;
	}
	public WebElement get_clickOnInformation() {
		return clickOnInformation;
	}
	public WebElement get_clickOnBackBtn() {
		return clickOnBackBtn;
	}

	public WebElement get_clickOnCrossBtn() {
		return clickOnCrossBtn;
	}
}
