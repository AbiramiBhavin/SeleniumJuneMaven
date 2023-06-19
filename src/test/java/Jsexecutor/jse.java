package Jsexecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// if the certain element is not clickable like any button not clickable
//if the exception is not interactable
public class jse 
{
public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;// through this executor we use This line
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement x= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		//inspect some button => some function would be involved=> inside function => JSP coding will be there 
		js.executeScript("document.getElementById('imagetrgt').click();");
		// the above line is for Imgsrc we use that .GETELEMENTBYID
//		driver.findElement(By.xpath("//input[@type='file']")).click();
		
		js.executeScript("arguments[0].click();",x);
		//js.executeScript("arguments[0].click();",y);
		//though we have many matches for xpath, we are slecting the first xpath
		js.executeScript("arguments[0].value='testing'",x);
		//js.executeScript("location.reload();");// to reload or refresh we use executeScript
}

}
