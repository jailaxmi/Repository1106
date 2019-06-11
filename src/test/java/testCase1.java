



import org.testng.annotations.Test;

import testBase.TestBase;

public class testCase1 extends TestBase {

	@Test
	public void testCase1()
	{
	 enterUrl("http://www.seleniumhq.org");
	 logger.info("title of page "+driver.getTitle());
	 
	}
}
