package handlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.name("firstname"));
			firstname.sendKeys("pratibha");
		WebElement surname=driver.findElement(By.name("lastname"));
			surname.sendKeys("ghadge");
		WebElement email=driver.findElement(By.name("reg_email__"));
			email.sendKeys("ghadgejah@gmail.com");
		
		WebElement gender=driver.findElement(By.xpath("//*[@id='sex' and @value='1']"));
		gender.click();
			Thread.sleep(500);
		
		List<WebElement> dayselect=driver.findElements(By.xpath("//*[@id='day']")); 
		for(WebElement Day:dayselect)
			if(Day.getText().equalsIgnoreCase("17"))
				Day.click();
		List<WebElement> monthselect=driver.findElements(By.xpath("//*[@id='month']")); 
		for(WebElement month:monthselect)
			if(month.getText().equalsIgnoreCase("nov"))
				month.click();
		List<WebElement> yearselect=driver.findElements(By.xpath("//*[@id='year']"));
		for(WebElement year:yearselect)
			if(year.getText().equalsIgnoreCase("2021"))
				year.click();
		
			Thread.sleep(500);
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("ghadge1234");
		}}
