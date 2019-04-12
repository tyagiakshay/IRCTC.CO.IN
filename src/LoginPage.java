import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="/html/body/app-root/app-home/app-header/div[2]/div[2]/div[1]/a[1]")
	private WebElement login;
	
	@FindBy(id="userId")
	private WebElement usn;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="captcha")
	private WebElement captcha;
	
	@FindBy(xpath="//*[@id='login_header_disable']/div/div[2]/app-login/div[2]/div/div/div[3]/div[2]/form/button")
	private WebElement sgnin;
	
	public WebElement LogIn(){return login;}
	public WebElement UserName(){return usn;}
	public WebElement Password(){return pwd;}
	public WebElement Captcha(){return captcha;}
	public WebElement SignIN(){return sgnin;}
	
	
}
