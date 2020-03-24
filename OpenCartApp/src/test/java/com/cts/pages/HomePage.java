package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	private static By myAccLocator = By.xpath("//a[@title='My Account']");
	private static By RegisterLocator = By.xpath("//a[text()='Register']");
	private static By LoginLocator = By.xpath("//a[text()='Login']");
	private static By AccTitleLoc=By.linkText("My Account");
	private static By CamClickLoc=By.linkText("Cameras");
	private static By IpodTouchWishListLoc=By.xpath("(//button[@type='button'])[19]");
	
	//Account click
	public static void clickOnMyAccount(WebDriver driver) 
	{
		driver.findElement(myAccLocator).click();
	}

	//click on login
	public static void clickOnLogin(WebDriver driver) 
	{
		driver.findElement(LoginLocator).click();
	}
	
	//Printing the text that appear after login
	public static String getCurrentTitle(WebDriver driver)
	{
		String actualTitle=driver.findElement(AccTitleLoc).getText();
		return actualTitle;
	}
	
	//Click on cameras
	public static void clickOnCameras(WebDriver driver)
	{
		driver.findElement(CamClickLoc).click();
	}
	
	
	}
		
	
	
	
	
	
	
	
	
	
	
	

