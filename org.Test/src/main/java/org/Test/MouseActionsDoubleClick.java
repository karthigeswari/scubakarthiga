package org.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleclick=driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).build().perform();
		Thread.sleep(2000);
	    Alert aler=driver.switchTo().alert();
	    String text=aler.getText();
	    System.out.println(text);
	    aler.accept();
	    
	    
		


	}

}
