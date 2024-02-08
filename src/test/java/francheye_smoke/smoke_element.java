package francheye_smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class smoke_element {

	WebDriver driver;
	
	public smoke_element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@class,'mx-2 hover:outline-primary rounded-3xl px-6 py-2 outline outline-sec dark:text-gray-50')]")
	WebElement login;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath = "//div[@class='w-max p-1 px-3 border-[1px] border-black rounded-md flex items-center justify-between gap-4 relative cursor-pointer']//*[name()='svg']")
	WebElement arrow;
	
	@FindBy(xpath = "//h1[normalize-space()='Youtube']")
	WebElement youtube;
	
	
	void clicklogin()  {
		login.click();
	}

	void enteremail()  {
		email.sendKeys("rohankapur2012@gmail.com");
	}
	void enterpassword()  {
		password.sendKeys("Redskin0$");
	}

	void clicksignin()  {
		signin.click();
	}
	
	void clickarrow()  {
		arrow.click();
	}
	
	void clickyoutube()  {
		youtube.click();
	}
		
		
		
	}


