package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.manage().window().maximize();
		
		WebElement username =driver.findElement(By.name("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.name("Submit"));
		login.click();

	}

}
