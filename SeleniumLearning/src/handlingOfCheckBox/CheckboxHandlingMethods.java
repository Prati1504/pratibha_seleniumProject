package handlingOfCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandlingMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		
		boolean select=driver.findElement(By.id("ohrmList_chkSelectRecord_29")).isSelected();
		System.out.println(select);
		
		boolean enable=driver.findElement(By.id("ohrmList_chkSelectRecord_29")).isEnabled();
		System.out.println(enable);
		
		boolean display=driver.findElement(By.id("ohrmList_chkSelectRecord_29")).isDisplayed();
		System.out.println(display);
		
		Thread.sleep(1000);
		driver.quit();

}
}