package BasicBrowserFunctions;
import java.time.LocalTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicCommands2 {
	 
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\library2019\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
	
	driver.get("http://amazon.com"); //enter url in the browser
	driver.manage().window().maximize();   //to launch in maximize screen
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());

    driver.navigate().to("http://www.seleniumhq.org");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());

	driver.navigate().back(); // navigate to previous page
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());

    driver.navigate().forward(); //navigate forward
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());

    driver.quit(); //closes all the browser instances opened through this driver
	

}
}
