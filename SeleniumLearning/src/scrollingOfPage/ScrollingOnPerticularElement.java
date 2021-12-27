package scrollingOfPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOnPerticularElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		
		WebElement checkbox=driver.findElement(By.xpath("//div[@id='search-results']//td//a[contains(text(),'Nina.Patel')]/parent::td//parent::tr//input"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",checkbox );
		//checkbox.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",checkbox);
		Thread.sleep(1000);
		
		driver.quit();

}
}