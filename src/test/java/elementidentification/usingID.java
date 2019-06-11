package elementidentification;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import configReader.log4jConfigReader;

public class usingID {

	public static void main(String[] args) {
		
        PropertyConfigurator.configure("config/log4j.properties");
        Logger logger = Logger.getLogger(usingID.class); //name of the test case
        logger.error("********initializing test case********");


		System.setProperty("webdriver.chrome.driver", "C:\\library2019\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.weddingshop.com/account-login"); 
		driver.manage().window().maximize(); 
		logger.info("chrome Browser is launched");
		
		WebElement txtTitle= driver.findElement(By.id("userName")); //identifying using element attribute id
		txtTitle.sendKeys("Title value abc"); //to enter text value
		txtTitle.clear();
		txtTitle.sendKeys("updating title value");		
		
		// driver.findElement(By.id("title")).sendKeys("updated");// identifying using element attribute id
	}

}
