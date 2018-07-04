package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver o = new ChromeDriver();
		
		//Opening LinkedIn website
		o.get("https://www.linkedin.com");
		
		//Printing website Title on console
		System.out.println(o.getTitle());
		
		//printing website URL
		System.out.println(o.getCurrentUrl());;
		
		o.findElement(By.id("login-email")).sendKeys("xxxxxxxxx123@gmail.com");
		o.findElement(By.id("login-password")).sendKeys("xxxxxxxxxx");
		o.findElement(By.xpath("//*[@id='login-submit']")).click();
		
		Thread.sleep(2000);
		

	}

}
