package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/GANGA/Documents/seleniumbatch/dropdown.html");
		WebElement movies=driver.findElement(By.id("movies"));
		Select s=new Select(movies);
		s.selectByVisibleText("Premam");
		s.selectByVisibleText("KGF");
		WebElement firstoption=s.getFirstSelectedOption();
		System.out.println(firstoption.getText());
}
}
//KGF






