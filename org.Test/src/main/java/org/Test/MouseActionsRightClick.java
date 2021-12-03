package org.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doub=driver.findElement(By.xpath("//span[contains(text(),'right ')]"));
		Actions act=new Actions(driver);
		act.contextClick(doub).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Cut')]")).click();
		Thread.sleep(2000);
		Alert aler=driver.switchTo().alert();
		String context=aler.getText();
		System.out.println(context);
		aler.accept();
		
	
	
		
		

	}

}
