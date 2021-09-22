import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Ifelse {

	public static void main(String[] args) throws InterruptedException {
		
	Scanner scanner = new Scanner(System.in);
		        int choice = 1;
		        while(true){
		            System.out.println("Enter your choice \n 1.Chrome  2.Edge 3.Other ");
		            choice = scanner.nextInt();
		            if(choice==1){
		            	
							System.out.println("Linkedinsite");
							System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
							WebDriver abc=new ChromeDriver();
							abc.get("https://www.linkedin.com/login");
							Thread.sleep(2000);
							abc.findElement(By.id("username")).sendKeys("admin");
							abc.findElement(By.name("session_password")).sendKeys("12345678");
							abc.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
							System.out.println(abc.findElement(By.id("error-for-username")).getText());
							abc.findElement(By.linkText("Forgot password?")).click();
							Thread.sleep(2000);
							abc.findElement(By.partialLinkText("Sign")).click();
							Thread.sleep(5000);
							System.out.println("Chrome brower launched succesfully");
							abc.close();
							
							}
		            else if(choice==2)	
							{
								System.setProperty("webdriver.edge.driver", "C:\\Softwares\\edgedriver_win64\\msedgedriver.exe");
								WebDriver abc1=new EdgeDriver();
								abc1.get("https://www.google.com/");
								String vTitle=abc1.getTitle();
								System.out.println("Title is......."+vTitle);
								Thread.sleep(5000);
								System.out.println("Edge brower launched succesfully");
								abc1.close();
								
							}
		            else if(choice==3)	
							{
								
								System.out.println("Other brower");
								
							}
		            }
		        }
	}
