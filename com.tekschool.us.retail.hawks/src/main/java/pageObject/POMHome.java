package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.BaseClassHome;

public class POMHome extends BaseClassHome {
		
	public POMHome() {
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath = "//a[contains(text(),'Wish List')]")
	private WebElement HomePageWishList;
	
	@FindBy (xpath = "//body/div[@id='account-login']/div[1]/aside[1]/div[1]/a[2]")
	private WebElement RegisterBtn;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath = "input-lastname")
	private WebElement LastName;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement E_Email;
	
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement Telephone;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement ConfirmPassword;
	
	
	@FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")
	private WebElement YesBtn;
	
	@FindBy (xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")
	private WebElement NoBtn;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement Privacy;
	
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement ContinueBtn;
	
	
public void MainPageWishList() {
	HomePageWishList.click();
	
}
public void Register()	{
	RegisterBtn.click();
	
}
public void inputFirstName() {
	FirstName.sendKeys("Yahoo");

}
public void inputLastName() {
	LastName.sendKeys("gmail");
	
}
public void inputEmail() {
	E_Email.sendKeys("Yahoo@yahoo.com");
			
}
public void inputTelelphone() {
	Telephone.sendKeys("343-345-3432");

}
public void inputPasswordConfirm() {
	Password.sendKeys("asdf1234");
	
	
}
public void NewsLetterYesBtn()	{
	YesBtn.click();
	
}
public void NewsLetterNoBtn() {
	NoBtn.click();
	
}
public void privacyCheckbox() {
	Privacy.click();

}
public void ContinueButton(){
	ContinueBtn.click();
	
}
}
	