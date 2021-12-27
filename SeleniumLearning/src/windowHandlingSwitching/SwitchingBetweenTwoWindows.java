package windowHandlingSwitching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenTwoWindows {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();                  
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement login=driver.findElement(By.id("btnLogin"));
		
		String firstwindowid=driver.getWindowHandle();
		System.out.println(firstwindowid);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set<String> allId=driver.getWindowHandles();
	        for(String eachId :allId)
	        {
	        		if(!eachId.equals(firstwindowid)) {
	        		driver.switchTo().window(eachId);
	        		Thread.sleep(1000);
	        		driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();
	        	}
	        }
	        		driver.switchTo().window(firstwindowid);
	        		username.sendKeys("Admin");
	        		password.sendKeys("admin123");
	        		login.click();
	        		Thread.sleep(500);
	        		driver.quit();
	        		}

}
