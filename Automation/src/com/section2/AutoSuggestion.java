package com.section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	Thread.sleep(2000);
	List<WebElement> allsugg=driver.findElements(By.xpath
			("//div[@class='autocomplete-results-container']/div"));
	for(WebElement sug:allsugg)
	{
		String suggestion=sug.getText();
		if(suggestion.contains("for men"))
		{
			sug.click();
			break;
		}
	}
	}

}







