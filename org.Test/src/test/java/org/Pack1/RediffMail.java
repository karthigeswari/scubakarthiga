package org.Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("Nishidha");




}
}