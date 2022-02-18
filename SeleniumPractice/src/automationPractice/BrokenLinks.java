package automationPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void verifyActiveLinks(String linkurl)
	{
		try
		{
			URL url= new URL(linkurl);
			HttpURLConnection connect = (HttpURLConnection)url.openConnection();
			connect.setConnectTimeout(3000);
			connect.connect();
			if(connect.getResponseCode()==200)         
			{
				System.out.println(linkurl +"- " + connect.getResponseMessage());
			}
			if(connect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{
				System.out.println(linkurl +"- " + connect.getResponseMessage() +" - " +HttpURLConnection.HTTP_NOT_FOUND );
			}
		}
		catch (Exception e)
		{       }	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/downloads");
		driver.manage().window().maximize();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println("total links : " + links.size());
		for(WebElement Eachlink: links)
		{
			String url= Eachlink.getAttribute("href");
			verifyActiveLinks(url);
		}}
}
