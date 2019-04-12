import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='origin']/span/input")
	private WebElement from;
	
	@FindBy(xpath="//*[@id='destination']/span/input")
	private WebElement to;
	
	@FindBy(xpath="//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/input")
	private WebElement date;
	
	@FindBy(xpath="//*[@id='journeyClass']/div/label")
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
