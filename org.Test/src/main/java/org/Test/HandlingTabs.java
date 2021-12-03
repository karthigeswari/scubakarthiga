package org.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\Selenium\\chromedriver_32bit\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[contains(text(),'account')])[2]")).click();
		ArrayList <String> GmailTab=new ArrayList <String> (driver.getWindowHandles());
		for (String output:GmailTab) {
			System.out.println(output);
		}
	
		driver.switchTo().window(GmailTab.get(0));
		driver.findElement(By.id("firstName")).sendKeys("karthiga");
		
		
		

	}

}
