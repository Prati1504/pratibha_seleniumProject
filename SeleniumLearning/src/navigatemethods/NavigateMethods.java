package navigatemethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();      //close the current window
		driver.quit();       //close entire browser
	}

}
