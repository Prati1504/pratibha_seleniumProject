package seleniumUtilityClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		utilityClass use= new utilityClass();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		use.driver=new ChromeDriver();
		
		use.driver.get("https://opensource-demo.orangehrmlive.com");
		use.driver.manage().window().maximize();
		
		String username=use.readFromExcel(0, 0, 0);
		use.driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		String password=use.readFromExcel(0, 1, 0);
		use.driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
		use.driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(1000);
		use.screenshot();
	}

}
