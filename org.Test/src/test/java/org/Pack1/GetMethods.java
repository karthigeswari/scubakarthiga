package org.Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Aumation test\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://zero.webappsecurity.com/");
	driver.manage().window().maximize();
	//System.out.println(driver.getTitle());
	String PageTitle=driver.getTitle();
    System.out.println(PageTitle);
    String PageUrl=driver.getCurrentUrl();
    System.out.println(PageUrl);
    String Tag=driver.findElement(By.id("searchTerm")).getTagName();
     System.out.println(Tag);
    String TagName2=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getTagName();
    System.out.println(TagName2);
    String attribute=driver.findElement(By.id("searchTerm")).getAttribute("id");
    System.out.println(attribute);
    String Css=driver.findElement(By.id("searchTerm")).getCssValue("font-size");
    System.out.println(Css);
    String Text=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
    System.out.println(Text);
    String Paragraph=driver.findElement(By.xpath("(//p[starts-with(text(),'Use Zero to')])[1]")).getText();
   System.out.println(Paragraph);

	}
}
