package Someverifications;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enablfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='Cricket']"));
		
		
		if(btn.isEnabled())
		{
			//isEnabled is used to check if the button is enabled or not
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}

	}

}
