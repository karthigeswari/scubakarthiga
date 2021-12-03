
package org.Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class YourLogo {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\Selenium\\chromedriver_32bit\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("login")).click(); 
		driver.findElement(By.id("email_create")).sendKeys("444abcdf66114wer545@gmail.com");	
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(4000);
		//driver.findElement(By.id("id_gender2")).click();
		WebElement gender=driver.findElement(By.id("id_gender2"));
		gender.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("karthigeswari");
		driver.findElement(By.id("customer_lastname")).sendKeys("satishnandan");
		driver.findElement(By.id("passwd")).sendKeys("demo@1A88");
		Select date=new Select(driver.findElement(By.id("days")));
		date.selectByVisibleText("4  ");	
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("February ");
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("2020  ");
		WebElement newletter=driver.findElement(By.id("newsletter"));
		newletter.click();
		driver.findElement(By.id("firstname")).sendKeys("ranaha");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("kajskd");
		Thread.sleep(1000);
		driver.findElement(By.id("address1")).sendKeys("jhdajhdjabsd bjibdjsb bdjasb");
		Thread.sleep(1000);
		driver.findElement(By.id("address1")).sendKeys("chennai");
		Thread.sleep(1000);
		driver.findElement(By.id("city")).sendKeys("chennai");
		Thread.sleep(6000);
        Select state=new Select(driver.findElement(By.id("id_state")));
        state.selectByVisibleText("Florida");
        Thread.sleep(1000);
        driver.findElement(By.id("postcode")).sendKeys("99898");
        Thread.sleep(1000);
        driver.findElement(By.id("phone_mobile")).sendKeys("9125152412");
		driver.findElement(By.id("submitAccount")).click();
		
		

		
		
		
	}

}
