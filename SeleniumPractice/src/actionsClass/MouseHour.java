package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHour {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().window().maximize();
		
		WebElement text=driver.findElement(By.id("menu_leave_viewLeaveModule"));
		
		Actions act=new Actions(driver);
		act.moveToElement(text).perform();
		Thread.sleep(1000);
		driver.quit();

	}

}
