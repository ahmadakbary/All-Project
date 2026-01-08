package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClassCamras;

public class POMCamras extends BaseClassCamras{

	public POMCamras() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy (linkText = "Camras")
		private WebElement ClickOnCamras;
		
		@FindBy (xpath = "//a[contains(text(),'Show All Cameras')]")
		private WebElement ShowAll ;
			
		@FindBy (xpath = "//a[contains(text(),'Nikon D300')]")
		private WebElement ClickOnNikonD300;
		
		@FindBy (xpath = "//input[@id='input-quantity']")
		private WebElement ClickOnQuantity;
			
		@FindBy (xpath = "//button[@id='button-cart']")
		private WebElement AddToCartBtn;
		
			
		public void Camras() {
			ClickOnCamras.click();
		
		}
		public void ShowAllButton () {
			ShowAll.click();

		}	
		public void NikonD300Img() {
			ClickOnNikonD300.click();
			
		}
		public void Quantity () {
			ClickOnQuantity.sendKeys("3");
					
		}
		public void AddToCart() {
			AddToCartBtn.click();
			
			
		}
}
