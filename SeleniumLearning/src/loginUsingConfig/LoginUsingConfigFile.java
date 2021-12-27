package loginUsingConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingConfigFile {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		
		File path=new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumLearning\\config.properties");
		FileInputStream file=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(file);
		
		
		ChromeDriver driver =new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

}
