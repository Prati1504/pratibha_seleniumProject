package handlingOfCheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAlternateCheckBoxes {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//*[contains(@id,'txtUsername')]"));
			username.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//*[contains(@id,'txtPassword')]"));
			password.sendKeys("admin123");
		driver.findElement(By.xpath("//*[contains(@id,'btnLogin')]")).click();
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//*[contains(@id,'menu_admin_UserManagement')]")).click();
		List<WebElement> checkboxes=driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord')]"));
		
		for(int i=0;i<checkboxes.size();i=i+2)
		{
			checkboxes.get(i).click();
		}}
}
