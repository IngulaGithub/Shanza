package com.Framework;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.POMclasses.Homepage;
import com.POMclasses.Loginpage;

public class Propertiesfile {

	@Test
	public void propertyfile() throws Throwable {        //----------->just change main method removing static and args
	        WebDriver driver=new ChromeDriver();
	        
	        FileInputStream fil=new FileInputStream("./src/test/resources/commondata.properties.txt");
	        Properties pro=new Properties();
	        pro.load(fil);
	        String URL = pro.getProperty("url");
	        String USER = pro.getProperty("username");
	        String PASS = pro.getProperty("password");
	        
	        driver.get(URL);
	        driver.manage().window().maximize();
	        
	        Loginpage log=new Loginpage(driver);
	        log.Login(USER, PASS);
	        
	        /*driver.findElement(By.id("username")).sendKeys(USER); 
			driver.findElement(By.name("pwd")).sendKeys(PASS);  
			driver.findElement(By.className("initial")).click(); */
	        Thread.sleep(1000);
	        Homepage home=new Homepage(driver);
	        home.view();
	        home.lock();
	        home.approve();
	        home.enter();
	  }
}
