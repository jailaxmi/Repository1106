package BasicBrowserFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\library2019\\IEDriverServer.exe");

		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		
		
		
		
		

	}

}
