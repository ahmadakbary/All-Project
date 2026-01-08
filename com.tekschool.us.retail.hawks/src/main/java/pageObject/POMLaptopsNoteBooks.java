package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.type.CollectionLikeType;

import core.BaseClassLaptopsNoteBooks;

public class POMLaptopsNoteBooks extends BaseClassLaptopsNoteBooks {
	
	public POMLaptopsNoteBooks() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "LapTop&NoteBooks")
	private WebElement LapTopAndNoteBooks;
	
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement clickOnTable;
	
	@FindBy (xpath = "//*[contains(text(),'Samsung Galaxy Tab 10.1')]")
	private WebElement ClickOnSumsungGalaxy;
	
	@FindBy (xpath = "//input[@id='input-quantity']")
	private WebElement Qauntity;
	
	@FindBy (xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement AddToCart;
	
	
	

	public void LpTopNoteBooks() {
		LapTopAndNoteBooks.click();
		
	}
	public void Table()	{
		clickOnTable.click();
	}	
	public void SamsungGalaxy() {
		ClickOnSumsungGalaxy.click();
	}
	public void qty() {
		Qauntity.sendKeys("2");
	}
	public void AddTOCardButton	() {
		AddToCart.click();
	}
	
	
	
	
}
