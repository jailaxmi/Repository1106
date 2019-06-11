package JunitDemo;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@Test
	public void openNaukri() {
	PropertyConfigurator.configure("config/log4j.properties");
    Logger logger = Logger.getLogger("Naukri"); //name of the test case
		
	System.setProperty("webdriver.chrome.driver", "C:\\library2019\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.get("http://naukri.com"); //enter url in the browser
	
	driver.manage().window().fullscreen(); //to launch in full screen
	driver.manage().window().maximize(); //to launch in maximize screen
	logger.info("Launched Naukri website");
	String title=driver.getTitle();
	System.out.println(title);
	//Assert.assertEquals(" Recruitment - Job Search - Employment - Job Vacancies - Naukri.com" , title);
	driver.quit(); //closes all the browser instances opened through this driver
	}
	
	@Test
	public void openSeleniumHQ() {
	PropertyConfigurator.configure("config/log4j.properties");
    Logger logger = Logger.getLogger("seleniumHQ"); //name of the test case
			
	System.setProperty("webdriver.chrome.driver", "C:\\library2019\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	
	driver.get("http://seleniumhq.org"); //enter url in the browser
	driver.manage().window().fullscreen(); //to launch in full screen
	driver.manage().window().maximize();   //to launch in maximize screen
	logger.info("Launched seleniumHQ website");
	String title=driver.getTitle();
	System.out.println(title);
	//Assert.assertEquals(" Recruitment - Job Search - Employment - Job Vacancies - Naukri.com" , title);
    driver.quit(); //closes all the browser instances opened through this driver
	}
	
	@Test
	public void exceptionDemo() {
	PropertyConfigurator.configure("config/log4j.properties");
	Logger logger = Logger.getLogger("Exceptions"); 
	System.setProperty("webdriver.chrome.driver", "C:\\library2019\\chromedriver.exe");
	ArrayList list=new ArrayList();
	System.out.println(list.get(2));

}
	
}
