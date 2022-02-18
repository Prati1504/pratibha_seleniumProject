package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username =driver.findElement(By.name("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.name("Submit"));
		login.click();
		
		WebElement welcome=driver.findElement(By.linkText("Welcome chandru"));
		
		welcome.click();
		
		Thread.sleep(1000);
		
		WebElement logout=driver.findElement(By.linkText("Logout"));
		
		logout.click();
		
	}

}
