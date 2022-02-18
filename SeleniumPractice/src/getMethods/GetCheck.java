package getMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCheck {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("OrangeHRM"))
		         System.out.println("test is passed");
		else 
			System.out.println("test is failed");
		
		String URL=driver.getCurrentUrl();
		if(URL.equals("https://opensource-demo.orangehrmlive.com/"))
			System.out.println("test is passed");
		else
			System.out.println("test is failed");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
