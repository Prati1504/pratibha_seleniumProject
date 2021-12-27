package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKeys2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement text=driver.findElement(By.id("txtUsername"));
		
		Actions act=new Actions(driver);
		
		act.sendKeys(text,"admin123").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
		

		WebElement paste=driver.findElement(By.id("txtPassword"));
		paste.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		

	}

}
