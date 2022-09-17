package OrangeLoginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLogPageOBJRepo {
	
	public OrangeLogPageOBJRepo(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement clickbtn;
	
	public void clkbtn() {
		clickbtn.click();
	}
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwtab;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement logtab;
	
	public void cred(String uname, String passw) {
		logtab.sendKeys(uname);
		passwtab.sendKeys(passw);
	}
}
