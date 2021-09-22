
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Youcandeal
{
	

	public static void main(String[] args) throws InterruptedException  
	{
	
    System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
    WebDriver myD=new ChromeDriver();
    myD.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
	myD.manage().window().maximize();
	myD.findElement(By.id("food")).sendKeys("200");
	myD.findElement(By.id("clothing")).sendKeys("300");
	myD.findElement(By.id("shelter")).sendKeys("100");
	myD.findElement(By.id("monthlyPay")).sendKeys("400");
	myD.findElement(By.id("monthlyOther")).sendKeys("500");
	String vMonthlyincome= myD.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
	String vMonthlyexpense= myD.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
	System.out.println(vMonthlyincome);
	System.out.println(vMonthlyexpense);
	try {
	float i=Float.parseFloat(vMonthlyincome); 
	float j=Float.parseFloat(vMonthlyexpense); 
	System.out.println(i);
	System.out.println(j);
	if(i>j)
	{
		System.out.println("Income is greater");
	}
	else
	{
		System.out.println("Expense is greater");
	}
	}
	catch (NumberFormatException e) {
        System.out.println("This is not a number");
        System.out.println(e.getMessage());
     }
	System.out.println("End of Test");
	Thread.sleep(1000);
	myD.close();	
	}
	
}
