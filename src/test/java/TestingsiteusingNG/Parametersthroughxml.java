package TestingsiteusingNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersthroughxml {
	
	
	WebDriver driver;
	@Parameters({"emailId","pwd"}) // these parameters are used to runthe program through xml file
	// these emailId,pwd what we declared under method is passe thorugh parameters
	@Test
	public void logInTestCase(String emailId,String pwd)// declaring emaila and pwd because we will be entering there in xml
	{
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys(emailId);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys(pwd);	
	}

//Note: these email and pwd what we declared should be of correct spelling bcoz these are entered in xml and exe in xml  
}



