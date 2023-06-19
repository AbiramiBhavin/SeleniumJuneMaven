package Testngmyprograms;

import org.testng.annotations.Test;

public class changingprioti {
	@Test(priority = 2)// this annotation is used to control the execution of tc
	//priority is the order in which the tc are executed
	//lowest priority number executes first
	public void testCase01()
	{
		System.out.println("Executing TestCase01--!");
	}

	@Test(priority = -1)
	public void testCase03()
	{
		System.out.println("Executing TestCase03--!");
	}

	@Test(priority = 0)
	public void testCase02()
	{
		System.out.println("Executing TestCase02--!");
	}
// we can also run two classes under same pacakage by selecting two classes run as TestNG
	//the order of above is tc03,tc02,tc01
}


