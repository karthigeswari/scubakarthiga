package org.Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close(); IT WILL CLOSE SELENIUM FOCUSED WINDOW
		//driver.quit();IT WILL CLOSE ALL THE WINDOW OPENED BY SELENIUM PROGRAM

	}

}
