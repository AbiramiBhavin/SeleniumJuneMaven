package Testngmyprograms;

import org.testng.annotations.Test;

public class controlusingenable {
	@Test(priority = 2)
	public void testCase04()
	{
		System.out.println("Executing TestCase04--!");
	}

	@Test(priority = -1,enabled = false)// this enable false means the particular testcase will not be eceuted
	public void testCase06()
	{
		System.out.println("Executing TestCase06--!");
	}

	@Test(priority = 0)
	public void testCase05()
	{
		System.out.println("Executing TestCase05--!");
	}
	//we can run two classes by selecting java files and run as testNG
	// other way to execute the two java files is through xml file

}
