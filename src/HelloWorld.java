import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Helloworld");
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver abc=new ChromeDriver();
		abc.get("https://www.google.com/");
		String vTitle=abc.getTitle();
		System.out.println("Title is......."+vTitle);
		Thread.sleep(5000);
		abc.close();

	}

}
