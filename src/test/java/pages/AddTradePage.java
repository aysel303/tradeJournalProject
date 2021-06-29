package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AddTradePage {
	public AddTradePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id="username")
	public WebElement loginUserName;
	
	@FindBy(id="password")
	public WebElement loginPassword;
	
	@FindBy(css=".btn.btn-lg.btn-primary.btn-block")
	public WebElement signInBtn;
	
	@FindBy(xpath="//li[@class='nav-item active']//a[@class='nav-link']")
	public WebElement homePage;
	
	@FindBy(css=".btn.btn-primary.btn-sm.mb-3")
	public WebElement addTradeBtn;
	
	@FindBy(xpath="//p[text()='Save Trade']")
	public WebElement saveTradeHeading;
	
	@FindBy(id="longTrade")
	public WebElement dropDown;
	
	@FindBy(id="symbol")
	public WebElement symbolTextBox;
	
	@FindBy(id="openDate")
	public WebElement openDate;
	
	@FindBy(id="entry")
	public WebElement entryPrice;
	
	
	@FindBy(id="closeDate")
	public WebElement closeDate;
	
	@FindBy(id="exit")
	public WebElement exitPrice;
	
	@FindBy(xpath="//button[text()='Save']")
	public WebElement saveBtn;
	
	@FindBy(xpath="//a[text()='Back to Transactions']")
	public WebElement backToTransactionLink;
}
