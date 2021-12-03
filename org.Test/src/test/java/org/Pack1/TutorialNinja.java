package org.Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinja {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
driver.manage().window().maximize();
driver.findElement(By.id("input-firstname")).sendKeys("nishi");
driver.findElement(By.id("input-lastname")).sendKeys("Satish");
driver.findElement(By.id("input-email")).sendKeys("abck2312@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("input-telephone")).sendKeys("88884444");
Thread.sleep(2000);
driver.findElement(By.id("input-password")).sendKeys("password123");
Thread.sleep(2000);
driver.findElement(By.id("input-confirm")).sendKeys("password123");
Thread.sleep(2000);
WebElement subscribe=driver.findElement(By.name("newsletter"));
subscribe.click();
driver.findElement(By.name("agree")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='agree']/following::input")).click();

	}

}
