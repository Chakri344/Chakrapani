
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon
{
	

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
    WebDriver myD=new ChromeDriver();
	
	myD.get("https://www.amazon.in/");
	myD.manage().window().maximize();
	Thread.sleep(2000);
	Select monthSelect=new Select(myD.findElement(By.id("searchDropdownBox")));
	monthSelect.selectByVisibleText("Deals");
	Thread.sleep(2000);
	myD.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung zfold3");
	myD.findElement(By.id("nav-search-submit-button")).click();
	myD.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
	String vSearch= myD.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]")).getText();
	System.out.println(vSearch);
	if(vSearch.contains("fold3"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	String vSearch1=myD.getTitle();
	System.out.println(vSearch1);
	if(vSearch1.contains("fold3"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	System.out.println("End of Test");
	Thread.sleep(1000);
	myD.close();
		
	}
	

}



