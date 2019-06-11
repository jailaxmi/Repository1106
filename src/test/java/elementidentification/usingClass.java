package elementidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\library2019\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.weddingshop.com/account-login"); 
		driver.manage().window().maximize();  
		
		WebElement txtTitle= driver.findElement(By.className("form-field__input form-control"));
		txtTitle.sendKeys("Title value abc");
		txtTitle.clear();
		txtTitle.sendKeys("updating title value");		
		
		//driver.findElement(By.id("title")).sendKeys("updated");
	}

}
