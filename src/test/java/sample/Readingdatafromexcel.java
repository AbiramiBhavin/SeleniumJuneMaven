package sample;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingdatafromexcel {

	public static void main(String[] args) throws Exception
	{
		
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath(readxpath("FirstName"))).sendKeys(readdata("FirstName"));
		driver.findElement(By.xpath(readxpath("LastName"))).sendKeys(readdata("LastName"));
		
		driver.findElement(By.xpath(readxpath("address"))).sendKeys(readdata("address"));
		
		driver.findElement(By.xpath(readxpath("Email_address"))).sendKeys(readdata("Email_address"));
		driver.findElement(By.xpath(readxpath("Phone"))).sendKeys(readdata("Phone"));
		driver.findElement(By.xpath(readxpath("Gender"))).click();
		
		driver.findElement(By.xpath(readxpath("Hobbies"))).click();
	}

	public static String readxpath(String fieldName) throws Exception
	{
		File src = new File("./RDX.xlsx");
		FileInputStream stream = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sheet= wb.getSheet("test");
		DataFormatter format = new DataFormatter();
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			if(format.formatCellValue(sheet.getRow(i).getCell(0)).equals(fieldName))
			{
				return format.formatCellValue(sheet.getRow(i).getCell(1));
			}
		}
		wb.close();
		return null;
		
	}
	public static String readdata(String fieldName) throws Exception
	{
		File src = new File("./RDX.xlsx");
		FileInputStream stream = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sheet= wb.getSheet("testB");
		DataFormatter format = new DataFormatter();
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			if(format.formatCellValue(sheet.getRow(i).getCell(0)).equals(fieldName))
			{
				return format.formatCellValue(sheet.getRow(i).getCell(2));
			}
		}
		wb.close();
		return null;
		
	}
}


		
