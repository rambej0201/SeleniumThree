package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver r = new ChromeDriver();
		
		r.get("https://www.linkedin.com");
		System.out.println(r.getTitle());
		System.out.println(r.getCurrentUrl());
		Thread.sleep(1000);
		
		r.findElement(By.id("login-email")).sendKeys("xxxxxxxxx3@gmail.com");
		r.findElement(By.id("login-password")).sendKeys("458478");
		r.findElement(By.xpath("//*[@id='login-submit']")).click();
		//r.findElement(By.xpath("//*[@id='ember972']/input")).sendKeys("Google");
		//r.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Yahoo");
		Thread.sleep(2000);
		r.findElement(By.xpath("//*[@id='nav-settings__dropdown-trigger']/img")).click();
		
			Thread.sleep(2000);
			//r.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		
		//r.findElement(By.id("ember3116")).click();
		Thread.sleep(2000);
		r.close();

	}

}
