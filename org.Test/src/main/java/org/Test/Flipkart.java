package org.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub										
		System.setProperty("webdriver.chrome.driver", "C:\\Aumation test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//div[contains(text(),'REDMI 9i Sport (Carbon Black, 64 GB)')]")).click();
		
		
		
		
		
		
		
		
	
	

}
}