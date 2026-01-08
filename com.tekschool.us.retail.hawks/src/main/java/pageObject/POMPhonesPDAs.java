package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.BaseClassPhonePDAs;

public class POMPhonesPDAs extends BaseClassPhonePDAs {
	
	public POMPhonesPDAs() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
	private WebElement PhoneAndPDAs;
	
	@FindBy (xpath = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement HTCTouchHD;
	
	@FindBy(xpath = "//*[contains(text(),'Returns')]")
	private WebElement Return;
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy (xpath = "//*[@name='lastname']")
	private WebElement LastName;
	
	@FindBy (xpath = "//*[@name='email']")
	private WebElement Email;
	
	@FindBy (xpath = "telephone")
	private WebElement Telephone;
	
	@FindBy (xpath = "//input[@name='order_id']")
	private WebElement Order_ID;
	
	@FindBy (xpath = "//input[@id='input-product']")
	private WebElement ProductName;
	
	@FindBy (xpath = "//*[@name='model']")
	private WebElement ProductCode;
	
	@FindBy (xpath = "//*[@id='input-quantity']")
	private WebElement Quantity;
	
	
	public void phonePDAs() {
		PhoneAndPDAs.click();
	}
	public void HTCTouch() {
		HTCTouchHD.click();
		
	}
	public void ReturnItems() {
		Return.click();
		
	}
	public void inputFirstName() {
		FirstName.sendKeys("John");
	
	}
	public void inputLastName() {
		LastName.sendKeys("Mike");
	
	}
	public void inputEmail() {
		Email.sendKeys("Jmike@yahoo.com");
		
	}
	public void Inputtelephone() {
		Telephone.sendKeys("345-345-3423");
		
	}
	public void inputOrderId() {
		Order_ID.sendKeys("23");
		
	}
	public void inputProductName() {
		ProductName.sendKeys("iPhone");
		
	}
	public void inputProductCode()	{
		ProductCode.sendKeys("24");
		
	}
	public void inputQuantity() {
		Quantity.sendKeys("1");
	}
}


//http://tek-school.com/retail/index.php?route=account/return/add