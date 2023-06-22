package com.Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		//WebElement data = driver.findElement(By.xpath("//button[text()='Or select file to upload']"));
		WebElement data = driver.findElement(By.id("file-upload"));
		data.sendKeys("C:\\Users\\WINDOWS-10\\Desktop\\Snehitha_Automation_QA_Resume.Doc");
		System.out.println("uploaded sucessfully");
		

	}

}
