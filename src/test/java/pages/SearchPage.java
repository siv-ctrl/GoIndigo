package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='roundTrip']")
	private WebElement roundTrip;
	@FindBy(xpath="(//*[@name='or-src'])")
	private WebElement src;
	@FindBy(xpath="(//*[@name='or-dest'])")
	private WebElement dest;
	@FindBy(xpath="(//*[@name='or-depart'])")
	private WebElement depart;
	@FindBy(xpath="(//*[text()='15'])[1]")
	private WebElement departDate;
	@FindBy(xpath="(//*[@name='or-return'])")
	private WebElement retrn;
	@FindBy(xpath="(//*[text()='18'])[1]")
	private WebElement retrnDate;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	public SearchPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void search(String Src,String Dest) throws InterruptedException {
		roundTrip.click();
		src.sendKeys(Src);
		dest.sendKeys(Dest);
		Thread.sleep(2000);
		depart.click();
		departDate.click();
		Thread.sleep(2000);
		retrn.click();
		retrnDate.click();
		Thread.sleep(2000);
		submit.click();
	}	
}
