package francheye_smoke;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class socialmedia {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://francheye.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		smoke_element driver1 = new smoke_element(driver);
		
		driver1.clicklogin();
		driver1.enteremail();
		driver1.enterpassword();
		Thread.sleep(300);
		driver1.clicksignin();
		Thread.sleep(300);
		driver1.clickarrow();
		Thread.sleep(300);
		driver1.clickyoutube();
		

	}

}
