package org.Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PetStore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Aumation test\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
driver.manage().window().maximize();
driver.findElement(By.name("username")).sendKeys("Nishidhasatish");
Thread.sleep(1000);
driver.findElement(By.name("password")).sendKeys("Nishidha@1234");
Thread.sleep(1000);
driver.findElement(By.name("repeatedPassword")).sendKeys("Nishidha@1234");
Thread.sleep(1000);
driver.findElement(By.name("account.firstName")).sendKeys("Nishidhas");
Thread.sleep(1000);
driver.findElement(By.name("account.lastName")).sendKeys("satish");
Thread.sleep(1000);
driver.findElement(By.name("account.email")).sendKeys("satishabc@gmail.com");
Thread.sleep(1000);
driver.findElement(By.name("account.phone")).sendKeys("9988447711");
Thread.sleep(1000);
driver.findElement(By.name("account.address1")).sendKeys("no 2a,3rd steert,abc city");
Thread.sleep(1000);
driver.findElement(By.name("account.address1")).sendKeys("chennai central area");
Thread.sleep(1000);
driver.findElement(By.name("account.city")).sendKeys("chennai");
Thread.sleep(1000);
driver.findElement(By.name("account.state")).sendKeys("Tamilnadu");
Thread.sleep(1000);
driver.findElement(By.name("account.zip")).sendKeys("50052");
Thread.sleep(1000);
driver.findElement(By.name("account.country")).sendKeys("India");
Thread.sleep(1000);
Select language=new Select(driver.findElement(By.name("account.languagePreference")));
language.selectByVisibleText("english");
Thread.sleep(1000);
Select fav=new Select(driver.findElement(By.name("account.favouriteCategoryId")));
fav.selectByVisibleText("DOGS");
Thread.sleep(1000);
driver.findElement(By.name("account.listOption")).click();
Thread.sleep(1000);
driver.findElement(By.name("account.bannerOption")).click();
Thread.sleep(1000);
driver.findElement(By.name("newAccount")).click();


Thread.sleep(1000);









	}

}
