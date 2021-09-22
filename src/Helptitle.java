import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.interactions.Actions;


public class Helptitle
{	

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
    WebDriver myD=new ChromeDriver();
	
	myD.get("https://gmail.com/");
	myD.manage().window().maximize();
	Thread.sleep(2000);
	String vTitle=myD.getTitle();
	System.out.println(vTitle);
	myD.findElement(By.xpath("//*[text()='Sign in']")).click();
	myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	myD.findElement(By.xpath("//*[text()='Help']")).click();
	System.out.println(vTitle);
	Set<String> ids=myD.getWindowHandles();
	System.out.println(ids);
	Iterator<String> it=ids.iterator();
	String ParentID=it.next();
	String ChildID=it.next();
	myD.switchTo().window(ChildID);
	System.out.println(myD.getTitle());
	Thread.sleep(2000);
	myD.quit();
	
}
	
}
