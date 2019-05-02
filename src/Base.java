import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract class Base {
	WebDriver driver;
	public Base(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
}
