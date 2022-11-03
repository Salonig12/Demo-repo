import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
	
  // First set the property which will have Key(which browser selected) and Value(location of chrome diver)
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        // To launch chrome browser
		WebDriver driver = new ChromeDriver();
		// Hit the url
		driver.get("https://www.amazon.com");
		//To get the title of the page
		System.out.println(driver.getTitle());
		//Close the browsers
		driver.quit();
		
		//For Firefox - Need Gecko driver
		//For Edge - Need Edge browser
}

}
