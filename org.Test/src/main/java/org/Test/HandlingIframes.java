package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nunzioweb.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("oddcouple");
	String text=driver.findElement(By.xpath("//div[starts-with(text(),'A television')]")).getText();
	System.out.println(text);
	 

	}

}
