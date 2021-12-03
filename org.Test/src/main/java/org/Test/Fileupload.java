package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/upload/");
	driver.manage().window().maximize();
	WebElement choosefile=driver.findElement(By.id("uploadfile_0"));
	choosefile.sendKeys("C:\\Users\\nk534\\Desktop\\download.png");
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("submitbutton")).click();
	
	
	


}
}