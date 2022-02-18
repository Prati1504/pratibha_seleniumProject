package handlingOfCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

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
		Thread.sleep(500);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		
		WebElement attribute=driver.findElement(By.id("ohrmList_chkSelectRecord_25"));
		String value=attribute.getAttribute("id");
		
		System.out.println(value);
		driver.quit();
		
		
		
	
}
}
