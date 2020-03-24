package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
private static By searchLoc=By.xpath("//input[@type='text']");
private static By searchboxLoc=By.xpath("(//button[@type='button'])[4]");
private static By SearchTitleLoc=By.xpath("//a[text()='Samsung SyncMaster 941BW']");
private static By SearchTitleLoc2=By.xpath("//a[text()='Samsung Galaxy Tab 10.1']");
private static By invalidsearchLoc=By.xpath("//p[text()='There is no product that matches the search criteria.']");

//search for valid products
public static void searchText(WebDriver driver,String productname)
{
	driver.findElement(searchLoc).sendKeys(productname);
}

//search for invalid products
public static void searchBox(WebDriver driver)
{
	driver.findElement(searchboxLoc).click();
}

//printing valid search text
public static String getSearchRelatedTitle(WebDriver driver)
{
	String actualTitle=driver.findElement(SearchTitleLoc).getText();
	return actualTitle;
}

//printing invalid search text
public static String getSearchRelatedTitle2(WebDriver driver)
{
	String actualTitle=driver.findElement(SearchTitleLoc2).getText();
	return actualTitle;
}

public static String getinvalidSearchRelatedTitle(WebDriver driver)
{
	String actualTitle=driver.findElement(invalidsearchLoc).getText();
	return actualTitle;
}

}
