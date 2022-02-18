package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),'Login/Register')]")).click();
		Thread.sleep(1000);
	}

}
