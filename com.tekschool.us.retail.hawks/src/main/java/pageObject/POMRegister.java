package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class POMRegister extends Base{
	
	public POMRegister() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (linkText = "My Account")	
	private WebElement MyAccountBtn;
	
	@FindBy (linkText = "Register")	
	private WebElement RegisterBtn;

	@FindBy (xpath = "//*[@id='input-firstname']")	
	private WebElement FirstName;

	@FindBy (xpath = "//*[@id='input-lastname']")	
	private WebElement LastName;

	@FindBy (xpath = "//*[@name='email']")	
	private WebElement Email;
	
	@FindBy (xpath = "//input[@name='telephone']")
	private WebElement Phone;
	
	@FindBy (xpath = "//*[@name='password']")	
	private WebElement Password;

	@FindBy (xpath = "//input[@name='confirm']")	
	private WebElement PasswordConfirme;

	@FindBy (xpath = "//label[normalize-space()='Yes']")	
	private WebElement YesSubscribeButton;

	@FindBy (xpath = "//label[normalize-space()='No']")	
	private WebElement NoSubscribButton;
	
	@FindBy (xpath = "//*[@name='agree']")
	private WebElement PrivacyPolicy;
	
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement ContinueBtn;
	
	
	@FindBy (xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
	private WebElement SuccessMessage;

	
	public void ClickOnMyAccount() {
		MyAccountBtn.click();
	}
	public void ClickOnRegister() {
		RegisterBtn.click();		
	}
	public void FirstNameField(String FName) {
		FirstName.sendKeys(FName);
	}
	public void LastNameField(String LName) {
		LastName.sendKeys(LName);		
	}
	public void EmailField(String E_mail) {
		Email.sendKeys(E_mail);
	}
	public void TelephoneField(String Telephone) {
		Phone.sendKeys(Telephone);
		
	}
	public void PasswordField(String Pass) {
		Password.sendKeys(Pass);
	}
	public void PasswordConfirmeField(String PassConfirme) {
		PasswordConfirme.sendKeys(PassConfirme);
	}
	public void Subscriptions(String value) {
		if (value.equalsIgnoreCase("Yes")&& !YesSubscribeButton.isSelected())
			YesSubscribeButton.click();
		else if (value.equalsIgnoreCase("No")&& ! NoSubscribButton.isSelected())
			NoSubscribButton.click();
		
	
	}
	public void clickOnPrivacy() {
		if (PrivacyPolicy.isDisplayed())
		PrivacyPolicy.click();
	}
	public void clickOnContinueButton()	{
		ContinueBtn.click();
	}
	public String getSuccessMessage() {
		return SuccessMessage.getText();
	}
}
