package calenderHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();          
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();	

		WebElement month=driver.findElement(By.xpath("//select[@title='Change the month']"));
		Select sel1=new Select(month);
		sel1.selectByVisibleText("April");
		
		WebElement year=driver.findElement(By.xpath("//select[@title='Change the year']"));
		Select sel2=new Select(year);
		sel2.selectByVisibleText("2015");
			
		List<WebElement> allDate=driver.findElements(By.xpath("//tbody//tr//td//a"));
		for(WebElement eachDate:allDate)
		{
			String date=eachDate.getText();
			System.out.println(date);
			if(date.equalsIgnoreCase("27"))
			{
				eachDate.click();
			}
			
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
