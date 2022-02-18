package automationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		
		WebElement table=driver.findElement(By.xpath("//table[@id='resultTable']//tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int rowCount=rows.size();
		
		for(int i=0; i<rowCount; i++)
		{
			List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
			int colCount=columns.size();
			
			for(int j=0; j<colCount; j++)
			{
				String text=columns.get(j).getText();
				if(text.equals("Paul Collings"))
				{
					System.out.println("Value of Specific coloumn is :" + columns.get(j).getText());
				    //break;
				}
			}
		}
	}
}
