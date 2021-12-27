package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.xpath("//ul//li[@id='fourth']//a[@class='button button-orange'][1]"));
		WebElement destination=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		Actions act=new Actions(driver);                                     //using DragAndDrop
		act.dragAndDrop(source, destination).build().perform();
	
		act.clickAndHold(source).moveToElement(destination).release().build().perform();          //using clickAndHold()
	}

}
