package HDepot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
															//HomeDepot Project
	@FindBy (xpath = "(//*[text()='My Account'])[1]")  
	WebElement myaccount;
	
	@FindBy(xpath = "//span[contains(text(),'Register')]")
	WebElement Register;
	
	@FindBy (xpath = "//span[contains(text(),'Select & Continue')]")
	WebElement ClickContinue;

	@FindBy (id = "email")
	WebElement emailfield;
	
	@FindBy (id = "password-input-field")
	WebElement passwrdfield;
	
	@FindBy (id = "zipCode")
	WebElement ZipCode;
	
	@FindBy (id = "phone")
	WebElement phone;		
	
	@FindBy (xpath = "//div[@class='myAccount--button u--marginSmall-bottom']//label[@class='checkbox-btn__label-test u__text-align--left']")
	WebElement checkboxbtn;
	
	@FindBy(xpath="//span[contains(text(),'Create an Account')]")
	WebElement selectonCreatebtn;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);			
	}	
	public void MyAccount () {
		myaccount.click();
	}
	public void RegisterButtonClick() {
		Register.click();
	}	
	public void selectonbutton(){
		ClickContinue.click();	}
	public void email() {
		emailfield.sendKeys("akbary@yahoo.com");		
	}
	public void passwordfield() {
		passwrdfield.sendKeys("mo ta janan howaya");		
	}
	public void ZipcodeField() {
		ZipCode.sendKeys("202000");		
	}
	public void phonefiled() {
		phone.sendKeys("4545454545544");		
	}
	public void checkbox() {
		checkboxbtn.click();	
	}
	public void SelectOnCreate() {
		selectonCreatebtn.click();		
	}	
	}
		
		
		
		
	
		
	
	

