package package1;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;	

public class Test11_2 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement ele1=driver.findElement(By.id("vfb-6-0"));
		boolean status=ele1.isSelected();
			ele1.click();
			System.out.println("Element clicked");
	}
	

}
