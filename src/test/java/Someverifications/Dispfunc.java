package Someverifications;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dispfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		if(login.isDisplayed())
		{
			//isDisplayed function is used to verify if the button is displayed or not
			login.click();
			System.out.println("LOGIN button is clicked");
		}
		else
		{
			System.out.println("Log-in button is not displayed");
		}
		
		
	}

	}


