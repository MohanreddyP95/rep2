package mohan1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	static 
	{
		System.setProperty("webdrier.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
		//TakesScreenshot driver2=(TakesScreenshot)driver;
		//File ts = driver2.getScreenshotAs(OutputType.FILE);
		//File ts2=new File("./photos/google2.png");
	}
	

}
