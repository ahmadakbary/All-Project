package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W6Home {
WebDriver driver;

	@FindBy (id = "email")
	WebElement Field;
	
	@FindBy(name = "pass")
	WebElement password;
	
	@FindBy(id = "loginbutton")
	WebElement button;
	
	@FindBy(linkText = "Forgot account?")
	WebElement forgot;

	public W6Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	
	}
	public void email(String email) {
		Field.clear();
		Field.sendKeys(email);
	}
	public void pass(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	public void loginbutton() {
		button.click();	
	}
	public void fogotlink() {
		forgot.click();
		
	
	}
	
}
