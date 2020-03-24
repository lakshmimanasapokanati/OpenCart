package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LapTopPage {
	
	private static By LapTopClick=By.linkText("Laptops & Notebooks");
	private static By AllLapTopClickLoc=By.linkText("Show All Laptops & Notebooks");
	private static By HPcompareLoc=By.xpath("//i[@class='fa fa-exchange']");
	private static By MaccompareLoc=By.xpath("(//button[@type='button'])[14]");
	private static By SonycompareLoc=By.xpath("(//i[@class='fa fa-exchange'])[5]");
	private static By comparisionListLoc=By.xpath("//a[text()='product comparison']"); 

	//Click on Laptops and Notebooks
	public static void clickOnLaptopsandNotebooks(WebDriver driver)
	{
		driver.findElement(LapTopClick).click();
	}
	
	//click on show all laptops and desktops
	public static void clickOnShowAll(WebDriver driver)
	{
		Actions actions =new Actions(driver);
	     actions.moveToElement(driver.findElement(AllLapTopClickLoc)).pause(1000).doubleClick().build().perform();
	}

	//click on hp model laptop compare icon
public static void hpCompare(WebDriver driver) {
	driver.findElement(HPcompareLoc).click();
}

//click on macbook model laptop compare icon
public static void macCompare(WebDriver driver) {
	driver.findElement(MaccompareLoc).click();
}

//click on sony model laptop compare icon
public static void sonyCompare(WebDriver driver) {
	driver.findElement(SonycompareLoc).click();
}

//Comparision table for selected model laptops
public static void compareTable(WebDriver driver) {
	
	for(int i=0; i<=2;i++){
		  try{
		     driver.findElement(comparisionListLoc).click();
		     break;
		  }
		  catch(Exception e){
		     System.out.println(e.getMessage());
		  }
		}
}


}
