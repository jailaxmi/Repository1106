package elementidentification;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingTextProperty {

	public static void main(String[] args) throws InterruptedException {
		 PropertyConfigurator.configure("config/log4j.properties");
	     Logger logger = Logger.getLogger(usingTextProperty.class); //name of the test case
        
		String url="https://shop.auspost.com.au/register";
		String driverpath="C:\\library2019\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
	    WebDriver driver=new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();  
		logger.info("chrome Browser is launched");

		
		WebElement btnCreateAccount= driver.findElement(By.xpath("//button[@value='CreateAccount']"));
		btnCreateAccount.click();
		
		
		}

}
