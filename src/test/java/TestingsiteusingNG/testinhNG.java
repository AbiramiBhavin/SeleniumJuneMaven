package TestingsiteusingNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testinhNG {


	WebDriver driver;
	
	@Test(priority = 1)
	public void tc01()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	@Test(priority = 2)
	public void tc02()
	{
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("testA");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("testB");
	}

	@Test(priority = 3)
	public void tc03()
	{
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
	}
	
	@Test(priority = 4,dependsOnMethods = {"tc05"})
	// the above line is dependsOnMethods which means that tc05 is executed first followed by priority4 methods
	public void tc04()
	{
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
	}

	@Test(priority = 5)
	public void tc05()
	{
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");
		driver.findElement(By.xpath("//li[text()='India']")).click();
	}

}


	


