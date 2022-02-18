package windowHandlingSwitching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenMultipleWindows {
		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();                  
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String firstwindowid=driver.getWindowHandle();
		System.out.println(firstwindowid);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set<String> allId=driver.getWindowHandles();
	        for(String eachId :allId)
	        {
	        		driver.switchTo().window(eachId);
	        		if(driver.getTitle().contains("OrangeHRM HR Software | Free HR Software | HRMS | HRIS"))
	        		{
	        			Thread.sleep(1000);
	        			driver.findElement(By.xpath("//ul//li//a[@class='btn-orange trial-btn pulse ']")).click();
	        		}
	        		Thread.sleep(1000);
	        }
	        		driver.switchTo().window(firstwindowid);
	        		WebElement username=driver.findElement(By.id("txtUsername"));
	        		username.sendKeys("Admin");
	        		WebElement password=driver.findElement(By.id("txtPassword"));
	        		password.sendKeys("admin123");
	        		driver.findElement(By.id("btnLogin")).click();
	        		Thread.sleep(500);
	        		driver.quit();
	 }	
}
