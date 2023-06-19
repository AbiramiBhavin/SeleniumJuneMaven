package Testngmyprograms;

import org.testng.annotations.Test;

public class exectcuponanno {
	// during first time testNG add TestNG library then afetr adding import it
	// bascically these annotations are used to control tc
	@Test
	public void testCase01()
	{
		System.out.println("Executing TestCase01--!");
	}
	@Test
	public void testCase02()
	{
		System.out.println("Executing TestCase02--!");
	}
	
	@Test
	public void testCase03()
	{
		System.out.println("Executing TestCase03--!");
	}

}
