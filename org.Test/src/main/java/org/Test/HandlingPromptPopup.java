package org.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Textbox')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate ')]")).click();
		Alert aler=driver.switchTo().alert();
		System.out.println(aler.getText());
		aler.sendKeys("karthiga");
		Thread.sleep(3000);
		aler.accept();
		String printtext=driver.findElement(By.xpath("//p[contains(text(),'Automation')]")).getText();
		System.out.println(printtext);
		
		
		
		
	}
}

