package com.Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionpopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.cssSelector("div#container_tasks")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='checkbox inactive']/div[@class='img'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();

	}

}
