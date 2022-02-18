package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTextChange {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='populate-text']")).click();
		

		WebElement text=driver.findElement(By.xpath("//h2[@id='h2']"));
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
		
		
		String getText=text.getText();
		boolean result=getText.equalsIgnoreCase("Selenium Webdriver");
		System.out.println(result);
}
}
