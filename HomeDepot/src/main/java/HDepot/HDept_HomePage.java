package HDepot;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class HDept_HomePage extends HDept_MainClass{
		//public WebDriver driver;
		
		@FindBy (xpath = "(//*[text()='My Account'])[1]")
		WebElement myaccount;
		
		@FindBy (xpath = "(//*[text()='Register'])")
		WebElement RegisterButton;
	
	public HDept_HomePage() {
			PageFactory.initElements(driver, this);
			
	}
		
		
		public void clickMyAccount () {
			myaccount.click();
		}
		
		public HDept_LoginPage RegisterButtonClick() {
		RegisterButton.click();
		return new HDept_LoginPage();
		}

		
}

	
	


