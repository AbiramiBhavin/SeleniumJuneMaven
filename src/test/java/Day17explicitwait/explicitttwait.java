package Day17explicitwait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitttwait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		

	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Services']"))));
	driver.findElement(By.xpath("//div[text()='Services']")).click();
				
			}

	}


