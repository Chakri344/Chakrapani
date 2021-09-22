import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Helloworld");
		System.setProperty("webdriver.edge.driver", "C:\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		WebDriver abc=new EdgeDriver();
		abc.get("https://www.google.com/");
		String vTitle=abc.getTitle();
		System.out.println("Title is......."+vTitle);
		Thread.sleep(5000);
		abc.close();

	}

}
