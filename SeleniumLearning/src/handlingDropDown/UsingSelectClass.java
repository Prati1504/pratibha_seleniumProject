package handlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		
		WebElement firstname=driver.findElement(By.name("firstname"));
			firstname.sendKeys("pratibha");
		WebElement surname=driver.findElement(By.name("lastname"));
			surname.sendKeys("ghadge");
		WebElement moNo=driver.findElement(By.name("reg_email__"));
			moNo.sendKeys("7767960662");
	
		WebElement gender=driver.findElement(By.xpath("//*[@id='sex' and @value='1']"));
			gender.click();
		Thread.sleep(500);
		
		WebElement day=driver.findElement(By.xpath("//*[@id='day']"));
		Select sel=new Select(day);
		sel.selectByValue("15");
		
		WebElement month=driver.findElement(By.xpath("//*[contains(@id,'month')]"));
		Select sel1=new Select(month);
		sel1.selectByValue("4");
		
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("pratibha123");
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@id,'year')]"));
		Select sel2=new Select(year);
		sel2.selectByValue("1997");
		
	}

}
