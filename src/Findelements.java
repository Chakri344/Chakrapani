import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.interactions.Actions;


public class Findelements
{	

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
    WebDriver myD=new ChromeDriver();
	
	myD.get("https://www.google.com/");
	myD.manage().window().maximize();
	Thread.sleep(2000);
	int vButtoncount=myD.findElements(By.xpath("//input[@type='submit']")).size();
	System.out.println(vButtoncount);
	int vLink=myD.findElements(By.tagName("a")).size();
	System.out.println(vLink);
	for(int i = 0;i<vLink;i++)
	{
		System.out.println(myD.findElements(By.tagName("a")).get(i).getText());
		
	}
	
	Thread.sleep(2000);
	myD.close();
	
}
	
}
