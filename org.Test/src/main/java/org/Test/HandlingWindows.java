package org.Test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\Selenium\\chromedriver_32bit\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//driver.close();
		ArrayList <String> Naukariwindow=new ArrayList <String>(driver.getWindowHandles());
		for(String output:Naukariwindow)
		{
		System.out.println(output);
		}
		
		String MainWindow=driver.getTitle();
		System.out.println(MainWindow);
		driver.switchTo().window(Naukariwindow.get(1));
		String childwndow=driver.getTitle();
		System.out.println(childwndow);
		driver.close();
		

		
	}

}
