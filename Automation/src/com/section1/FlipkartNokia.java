package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNokia {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		driver.findElement(By.name("q")).sendKeys("nokia");
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
	}

}
//Nokia- Buy Products Online at Best Price in India - All Categories | Flipkart.com









