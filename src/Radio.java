import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("vfb-7-1")).click(); 	//Click on Radio button
		
		
		driver.findElement(By.id("vfb-6-0")).click();	//Click on Checkbox
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		

	}

}
