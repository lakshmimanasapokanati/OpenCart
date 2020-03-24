package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	private static By CheckOutClickLoc=By.xpath("//a[text()='Checkout']");
	
	private static By shoppingCartClickLoc=By.xpath("//span[text()='Shopping Cart']");
	
	private static By BillcontinueLoc=By.xpath("//input[@class='btn btn-primary']");
	
	private static By DeliverycontinueLoc=By.xpath("(//input[@class='btn btn-primary'])[2]");
	
	private static By DelmethodLoc=By.xpath("(//input[@class='btn btn-primary'])[3]");
	
	private static By TermsLoc=By.name("agree");
	
	private static By PaymethodLoc=By.xpath("(//input[@class='btn btn-primary'])[4]");
	
	private static By ConfirmOrderLoc=By.xpath("(//input[@class='btn btn-primary'])[5]");
	
	private static By ThanksLoc=By.xpath("//h1[text()='Your order has been placed!']");
	
	
	//Click on shopping cart 
	public static void shoppingCartClick(WebDriver driver)
	{
		driver.findElement(shoppingCartClickLoc).click();
	}
	
	
	//click on checkout
	public static void checkOutClick(WebDriver driver)
	{
		driver.findElement(CheckOutClickLoc).click();
	}
	
	//click on billing details
	public static void billDetailsClick(WebDriver driver)
	{
		driver.findElement(BillcontinueLoc).click();
	}
	
	//click on delivery details
	public static void deliveryDetailsClick(WebDriver driver)
	{
		driver.findElement(DeliverycontinueLoc).click();
	}
	
	//click on delivery method
	public static void deliveryMethodClick(WebDriver driver)
	{
		driver.findElement(DelmethodLoc).click();
	}
	
	//accepting terms and conditions click
	public static void termsClick(WebDriver driver)
	{
		driver.findElement(TermsLoc).click();
	}
	
	//Selecting Payment method
	public static void paycontinueClick(WebDriver driver)
	{
		driver.findElement(PaymethodLoc).click();
	}
	
	//click on confirm order
	public static void confirmOrderClick(WebDriver driver)
	{
		driver.findElement(ConfirmOrderLoc).click();
	}
	
	//Print thanks for shopping
	public static String thanks(WebDriver driver)
	{
		String thanks=driver.findElement(ThanksLoc).getText();
		return thanks;
	}

}
