package calenderHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender22 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();          
	
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		int i=0;
		while(i==0)
		{
			WebElement text=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String currentText=text.getText();
			if(!(currentText.equals("April 1997")))
					{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
					}
			else
			{
				break;
			}
		}
		driver.findElement(By.xpath("//table//tr//td//a[text()='15']")).click();
		Thread.sleep(1000);
		driver.quit();
}
}
