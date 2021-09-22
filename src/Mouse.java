import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.interactions.Actions;


public class Mouse
{	

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
    WebDriver myD=new ChromeDriver();
	
	myD.get("https://www.amazon.in/");
	myD.manage().window().maximize();
	Thread.sleep(2000);
	Actions vactions=new Actions(myD);
	vactions.moveToElement(myD.findElement(By.partialLinkText("Account & Lists"))).build().perform();
	Thread.sleep(2000);
	myD.findElement(By.xpath("(//*[text()='Your Account'])[2]")).click();
	Thread.sleep(2000);
	myD.close();
	
}
	
}