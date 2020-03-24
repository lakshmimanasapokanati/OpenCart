package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CamPage {
	
	private static By Canon5DclickLoc=By.xpath("//a[text()='Canon EOS 5D']");
	private static By Canon5DTitleLoc=By.xpath("//h1[text()='Canon EOS 5D']");
	private static By productCodeLoc=By.xpath("//li[text()='Product Code: Product 3']");
	private static By rewardLoc=By.xpath("//li[text()='Reward Points: 200']");
	private static By availLoc=By.xpath("//li[text()='Availability: 2-3 Days']");
	private static By costLoc=By.xpath("//h2[text()='$98.00']");

	
	//camera model click
	public static void clickOnCanonEOS5D(WebDriver driver)
	{
		driver.findElement(Canon5DclickLoc).click();
	}
	
	//To print model name
	public static String Canon5DDetails(WebDriver driver)
	{
		String canonTitle=driver.findElement(Canon5DTitleLoc).getText();
		return canonTitle;
	}
	
	//To print model code
	public static String ProductCode(WebDriver driver)
	{
		String productName=driver.findElement(productCodeLoc).getText();
		return productName;
	}
	
	//To print model Reward points
	public static String RewardPoints(WebDriver driver)
	{
		String rewardPoints=driver.findElement(rewardLoc).getText();
		return rewardPoints;
	}
	
	//print Availability of products
	public static String Availability(WebDriver driver)
	{
		String availability=driver.findElement(availLoc).getText();
		return availability;
	}
	
	//Print the cost of the model
	public static String Cost(WebDriver driver)
	{
		String cost=driver.findElement(costLoc).getText();
		return cost;
	}
	
}
