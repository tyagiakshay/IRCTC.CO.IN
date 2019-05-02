import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="p-autocomplete#origin>span>input")
	private WebElement from;
	
	@FindBy(css="p-autocomplete#destination>span>input")
	private WebElement to;
	
	@FindBy(css="input.ng-tns-c14-6.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ng-star-inserted")
	private WebElement date;
	
	@FindBy(css="div.ui-dropdown-trigger.ui-state-default.ui-corner-right")
	private WebElement classtype;
	
	@FindBy(xpath="//*[@id='journeyClass']/div/div[4]/div/ul/li[7]/span")
	private WebElement classtype3A;
	
	@FindBy(xpath="//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[7]/button")
	private WebElement find;
	
	public void FindTrains(){
		from.sendKeys("AMLAI - AAL");
		to.sendKeys("GHAZIABAD - GZB");
		date.sendKeys("24-06-2018");
		classtype.click();
		classtype3A.click();
	}
	

}
