package com.Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderpopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='notification-frame-173061b02']")));
		driver.findElement(By.cssSelector("[class='wewidgeticon we_close']")).click();
		String Mainwindow = driver.getWindowHandle();
		driver.switchTo().window(Mainwindow);*/
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='June 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='16']")).click();
		driver.findElement(By.xpath("//span[.='Return']")).click();
		driver.findElement(By.xpath("//div[text()='July']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='2']")).click();
		
	}
}
