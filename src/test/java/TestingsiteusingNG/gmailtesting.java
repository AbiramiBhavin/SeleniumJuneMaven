package TestingsiteusingNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class gmailtesting {
	
	
	WebDriver driver;
	
	@Test(dataProvider = "testData")
	public void logInTestCase(String emailId,String pwd)
	{
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys(emailId);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys(pwd);	
	}
	
	@DataProvider(name = "testData")
	public Object[][] dataValue()
	{
		return new Object[][] {{"testabc@gmail.com","123"},{"testtest@gmail.com","456"}};
			//{"testabc@gmail.com","123"},{"testtest@gmail.com","456"},
			//{"testabc@gmail.com","123"},{"testtest@gmail.com","456"}};
	}
	
	// these test provider are used to test with multiple values and that is declared using annotation 
	//@Test(dataProvider="testData")
	//multiple values in @DataProvider(name="testData")
	//these pubic object[][] dataValue() are common
	

}


