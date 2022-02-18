package automationPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo2ndWindowUingCount {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();                  
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		int count=0;
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set<String> allId=driver.getWindowHandles();
		for(String eachId: allId )
		{
			driver.switchTo().window(eachId);
			count++;
			if(count==2)
			{
				System.out.println(eachId);
				break;
			}
		}
	}
}
