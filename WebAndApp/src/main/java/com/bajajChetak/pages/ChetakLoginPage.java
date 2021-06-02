package com.bajajChetak.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;


public class ChetakLoginPage {
	
	@FindBy(xpath = ("//android.widget.EditText[@bounds='[330,904][982,995]']"))
	private WebElement username;
	@FindBy(xpath = ("//android.widget.EditText[@bounds='[97,1108][912,1199]']"))
	private WebElement password;
	@FindBy(xpath = ("//android.view.ViewGroup[@bounds='[97,1858][983,1989]']"))
	private WebElement signin;
	@FindBy(id=("com.android.permissioncontroller:id/permission_allow_button"))
	private WebElement clickOnAllowBtn;
	//@FindBy(id=("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
	//private WebElement clickOnLocationBtn;
	
	//Home Page
	
	
	@FindBy(xpath = ("//android.widget.ImageView[@bounds='[162,375][918,888]']"))
	private WebElement clickOnVehicle;
	@FindBy(xpath = ("//android.view.ViewGroup[@bounds='[54,987][1026,1113]']"))
	private WebElement clickOnInformation;
	@FindBy(xpath = ("//android.view.ViewGroup[@bounds='[89,498][217,627]']"))
	private WebElement clickOnBackBtn;
	@FindBy(xpath = ("//android.view.ViewGroup[@bounds='[54,1239][1026,1365]']"))
    private WebElement clickOnManageBtn;	
	//@FindBy(xpath = ("//android.view.ViewGroup[@bounds='[54,1365][1026,1491]']"))
	//private WebElement clickOnViewMyChetakbtn;
	
	
	public ChetakLoginPage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_username() {
		return username;
	}
	public WebElement get_password() {
		return password;
	}
	public WebElement get_signin() {
		return signin;
	}

	public WebElement get_clickOnAllowBtn() {
	   return clickOnAllowBtn;
	}
	
	//public WebElement get_clickOnLocationBtn() {
		//return clickOnLocationBtn;
	
	
	//This code is for Home Page
	
	public WebElement get_clickOnVehicle() {
		return clickOnVehicle;
	}
	public WebElement get_clickOnInformation() {
		return clickOnInformation;
	}
	public WebElement get_clickOnBackBtn() {
		return clickOnBackBtn;
	}

	public WebElement get_clickOnManageBtn() {
		return clickOnManageBtn;
	}
	
	//public WebElement get_clickOnViewMyChetakbtn() {
		//return clickOnViewMyChetakbtn;
	
}



