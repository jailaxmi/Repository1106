package elementidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathStartsWith {

	public static void main(String[] args) throws InterruptedException {
        
		String url="https://register.rediff.com/register/register.php?FormName=user_details";
		String driverpath="C:\\library2019\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
	    WebDriver driver=new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();  
		
		WebElement txtFullName= driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
		txtFullName.sendKeys("Name starts with 'name'"); 
		
		
		
	}

}
