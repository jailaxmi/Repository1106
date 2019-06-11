package elementidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxes {

	public static void main(String[] args) throws InterruptedException {
        
		String url="https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F";
		String driverpath="C:\\library2019\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
	    WebDriver driver=new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();  
		
		
		WebElement btnCreateAccount=driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]//following:: input[@id='password']  "));
		btnCreateAccount.click();
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		
		
		
		
	}

}
