package com.Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exceldata {
@Test
	public void excel() throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fex=new FileInputStream("./src/test/resources/commondata.properties.txt");
		Properties pro=new Properties();
		pro.load(fex);
		String URL = pro.getProperty("url1");
		
		driver.get(URL);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Batch.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Flipkart");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		driver.findElement(By.name("q")).sendKeys(data);
		

	}

}
