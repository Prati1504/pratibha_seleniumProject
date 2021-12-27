package windowHandlingSwitching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingWindowId {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();                  
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String firstwindowid=driver.getWindowHandle();
		System.out.println(firstwindowid);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		for(String SingleWindow: windows)
			System.out.println(SingleWindow);
		
		Thread.sleep(1000);
		driver.quit();
	}
}








