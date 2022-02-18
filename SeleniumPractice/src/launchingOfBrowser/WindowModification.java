package launchingOfBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowModification {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();                 
		
		//launching of browser using .get
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Dimension d=new Dimension(1200,700);
	
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().setSize(d);
		
	 	System.out.println(driver.manage().window().getPosition());
		
		Point p=new Point(5,10);
		driver.manage().window().setPosition(p);
	}
}
