
package w6pages;
import java.lang.reflect.Field;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class Home {
	WebDriver driver;
	
	@FindBy(name = "email")
	WebElement Field;
	
	@FindBy(id = "pass")
	WebElement passwrd;
	
	@FindBy(id = "loginbutton")
	WebElement button;
	
	@FindBy(linkText = "Forgot account?")
	WebElement forgot;
	
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
			
	}
	public void email() {
		Field.sendKeys("Sayed.rafi@yahoo.com");
	}
	public void psswdfield() {
		passwrd.sendKeys("kabuljna");
		
	}
	public void loginbutton() {
		button.click();
	}
	public void forgotlink () {
		forgot.click();
	
	
	}

}
