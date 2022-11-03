import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		
		//1- Count and print the numbers of links
		System.out.println(driver.findElements(By.tagName("a")).size());
	
		//2-Find out the footer part
	    WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	    //3- Print the number of footer part link
	   System.out.println(footerdriver.findElements(By.tagName("a")).size());
	   
	   //4- Only print the number of link for 1st column
	 WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	 System.out.println(coloumndriver.findElements(By.tagName("a")).size());
	
	//5- Print the number of link for 2nd column
	 //WebElement coloumndriver1 = footerdriver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
	 //System.out.println(coloumndriver1.findElements(By.tagName("a")).size());
	
	//6- Click on each link in the column and check if the pages are opening
	 for(int i = 1; i<coloumndriver.findElements(By.tagName("a")).size();i++)
	 {
		coloumndriver.findElements(By.tagName("a")).get(i).click();
		driver.close();
	 }
	 
	 
	
	
	  
	  
	   
	   
		
		
		

	}

}
