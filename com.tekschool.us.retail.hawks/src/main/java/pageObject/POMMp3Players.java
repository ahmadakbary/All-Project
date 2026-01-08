package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import core.BaseClassMp3Players;
public class POMMp3Players extends BaseClassMp3Players {
	
		
	public POMMp3Players() {
		PageFactory.initElements(driver, this);	
	}		
		@FindBy(linkText = "Mp3Player")
		private WebElement Mp3button;	
		
		@FindBy(xpath = "//a[contains(text(),'test 20 (0)')]")
		private WebElement clickOnMp3Options;
	
		@FindBy(xpath = "//img[@alt='HP Banner']")
		private WebElement clickOnImg;
				
		@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
		private WebElement itemsAddToCard;
				
		@FindBy(xpath = "//*[contains(text(),'Specification')]")
		private WebElement PcSpacs;
				
		

		public void Mp3Player()	{
			Mp3button.click();
		}		
		public void Mp3Options() {
			clickOnMp3Options.click();
			
		}
		public void clickOnPcBanner()	{
			clickOnImg.click();
		}		
		public void clikOnAddtoCard()	{
			itemsAddToCard.click();
		
		}
		public void computerSpecs()	{
			PcSpacs.click();
}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		