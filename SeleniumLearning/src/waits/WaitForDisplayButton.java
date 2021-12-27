package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForDisplayButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
		
		WebElement button=driver.findElement(By.xpath("//button[@id='hidden']"));
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(button));

		boolean display=driver.findElement(By.id("hidden")).isDisplayed();
		System.out.println(display);
	}

}
