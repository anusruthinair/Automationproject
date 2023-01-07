package com.section1;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;


public class FetchTitle {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		URL url=new URL("https://www.amazon.in/");
		driver.navigate().to(url);
		
		
		
		
	}

}
