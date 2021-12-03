package org.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsAndEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\Aumation test\Selenium\chromedriver_32bit\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("narayanankarthiga3@gmail.com");
        Actions act=new Actions(driver);
        act.sendKeys(Keys.TAB,"Karthiga@123").build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
     
        
        
}

}
