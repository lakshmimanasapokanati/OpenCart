package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MP3PlayerPage {

	private static By ClickOnMP3=By.linkText("MP3 Players");
	private static By ClickOnAllMP3=By.linkText("Show All MP3 Players");
	private static By MP3TitleLoc=By.xpath("//h2[text()='MP3 Players']");
	private static By IpodCartLoc=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[10]");
	
	//click on MP3 players
	public static void clickOnMP3Players(WebDriver driver)
	{
		driver.findElement(ClickOnMP3).click();
	}
	
	//click on all MP3 Players 
	public static void clickOnAllMP3(WebDriver driver)
	{
		Actions actions =new Actions(driver);
	     actions.moveToElement(driver.findElement(ClickOnAllMP3)).pause(1000).doubleClick().build().perform();
	}
	
	
	public static String getAllMP3Title(WebDriver driver)
	{
		String actualTitle=driver.findElement(MP3TitleLoc).getText();
		return actualTitle;
	}
	
	//Adding ipod model to cart
	public static void clickOnipodCart(WebDriver driver)
	{
		driver.findElement(IpodCartLoc).click();
	}
}
