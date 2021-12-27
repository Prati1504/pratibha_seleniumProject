package launchingOfBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();                 
		
		//launching of browser using .get
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/accounts/login/"); 
		//launching of browser using .navigate
		
		Thread.sleep(1000);
		driver.quit();
		System.out.println("program successfull");
	}

}
