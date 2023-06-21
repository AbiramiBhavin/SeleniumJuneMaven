package Someverifications;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class selecfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='Cricket']"));
		
		//btn.click();
		
		if(btn.isSelected())
		{
			//isSelected() function is used to check if the button is selected or not
			System.out.println("Button already Selected");
		}
		else
		{
			btn.click();
			System.out.println("We have clicked the button");
		}
		
		

	}

}
