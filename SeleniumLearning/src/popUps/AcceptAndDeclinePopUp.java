package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceptAndDeclinePopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}

}
