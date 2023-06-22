package com.Framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Fashion")).click();
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File des = new File("Failed.png");
		FileUtils.copyFile(src, des);

	}

}
