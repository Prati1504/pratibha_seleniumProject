package automationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> suggest= driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li/descendant::div[@class=\"wM6W7d\"]"));
		System.out.println( suggest.size());
		
		for(WebElement eachsuggest : suggest)
		{
			String text=eachsuggest.getText();
			if(text.contains("java compiler"))
			{
				eachsuggest.click();
				break;
			}
		}

	}

}
