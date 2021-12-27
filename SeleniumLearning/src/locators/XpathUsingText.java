package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement checktext=driver.findElement(By.xpath("//*[contains(text(),'LOGIN Panel')]"));
		String Text=checktext.getText();
		
		boolean result=Text.equalsIgnoreCase("LOGIN Panel");
		System.out.println(result);
		
	}

}
