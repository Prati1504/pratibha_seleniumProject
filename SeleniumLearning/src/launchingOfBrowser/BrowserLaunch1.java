package launchingOfBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch1 {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe ");
		System.setProperty("WebDriver.Firefox.driver", "C:\selenium\firefoxdriver_win32\firefoxdriver.exe");
		
		String browser="chrome";
		
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		
		if(browser.equals("ff"))
			driver=new FirefoxDriver();
	}

}
