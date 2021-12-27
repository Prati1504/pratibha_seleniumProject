package TableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.manage().window().maximize();
		
		WebElement username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.xpath("//input[@name='Submit']"));
		login.click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		
		
		List<WebElement> row=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody"));
		int rowCount=row.size();
		System.out.println(rowCount);
		

		List<WebElement> col=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/thead"));
		int colCount=col.size();
		System.out.println(colCount);
		
		
		}

}
