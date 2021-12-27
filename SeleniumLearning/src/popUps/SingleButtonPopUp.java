package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleButtonPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		driver.switchTo().alert().accept();
	}

}
