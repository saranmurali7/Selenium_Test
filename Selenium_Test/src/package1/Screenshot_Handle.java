package package1;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Handle implements IAutoConstants
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		takescreenshot("Flipkart_Loginpage");
		driver.quit();
		
	}
	//Creating a method which can be called any-time to take screenshot.
	public static void takescreenshot(String filename) throws IOException
	{
		//1)take screenshot and store in a file format.
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2)Now copy the screenshot to desired location using copyfile method:
		String path=IMAGE_PATH+filename+".png";
		File desfile=new File(path);
		FileUtils.copyFile(file, desfile);
	}

}
