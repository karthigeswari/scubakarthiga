package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwagLabAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		//act.sendKeys(Keys.ENTER,"secret_sauce").build().perform();
		//act.sendKeys(Keys.TAB).build().perform();
		//act.click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().window().maximize();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//div[@id='menu_button_container']/following::span[1]")).click();
		//Actions act1=new Actions(driver);
	    //act1.moveToElement(cart).build().perform();
	    //act1.sendKeys(Keys.ENTER).build().perform();
	    driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("karthiga");
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("karthiga");
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("9999");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        String text=driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")).getText();
        System.out.println(text);
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String Tagname=driver.findElement(By.xpath("//div[contains(text(),'arrive ')]/following::img[1]")).getTagName();
        System.out.println(Tagname); 
        String css=driver.findElement(By.xpath("//div[contains(text(),'arrive ')]/following::img[1]")).getCssValue("max-width");
        System.out.println(css);
        String attribute=driver.findElement(By.id("back-to-products")).getAttribute("name");
        System.out.println(attribute);
        
        
        
        
        
        
		
	
		
		
	
		

	}

}
