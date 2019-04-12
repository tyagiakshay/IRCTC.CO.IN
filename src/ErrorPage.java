import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ErrorPage extends Base{

	public ErrorPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="")
	private WebElement relogin;
	
	@SuppressWarnings("deprecation")
	public void ReLogin(){
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver);
		w.withTimeout(5, TimeUnit.MINUTES);
		w.pollingEvery(250, TimeUnit.MILLISECONDS);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
		relogin.click();
	}
}
