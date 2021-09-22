import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException {
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
		abc.close();

	}

}
