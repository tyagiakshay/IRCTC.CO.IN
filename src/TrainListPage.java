import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TrainListPage extends Base {


	public TrainListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id='divMain']/div/app-train-list/div[5]/div/div[2]/div[3]/div[2]/div/div[3]/div/div[2]/p-dropdown/div/label")
	public WebElement quota;
	
	@FindBy(xpath = "//*[@id='divMain']/div/app-train-list/div[5]/div/div[2]/div[3]/div[2]/div/div[3]/div/div[2]/p-dropdown/div/div[4]/div/ul/li[2]/span")
	public WebElement srcitizenquota;
	
	@FindBy(xpath = "//*[@id='check-availability']")
	public WebElement availablity;
	
	@FindBy(xpath="//*[@id='divMain']/div/app-train-list/p-confirmdialog[1]/div/div[3]/p-footer/div/button[2]/span[2]")
	public WebElement cnfquotaok;
	
	@FindBy(xpath="//*[@id='divMain']/div/app-train-list/div[5]/div/div[2]/div[3]/div[4]/div/div[1]/app-train-avl-enq/div[2]/div[1]/div[3]/div[1]/form/select")
	public WebElement classtype;
	
	@FindBy(xpath="//*[@id='divMain']/div/app-train-list/div[5]/div/div[2]/div[3]/div[4]/div/div[1]/app-train-avl-enq/div[2]/div[1]/div[3]/div[1]/form/select/option[2]")
	public WebElement classtype3A;

	public void ChangeClassCategoryto(int i){
		Select s = new Select(classtype);
		s.selectByIndex(i);
	}

}
