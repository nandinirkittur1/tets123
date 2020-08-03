package pom_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_Loginpage 
{
	//declaration
	@FindBy(name="email")
	private WebElement emailtbox;
	@FindBy(name="pass")
	private WebElement passtbox;
	@FindBy(xpath="//input[@aria-label='Log In']")
	private WebElement loginbtn;
	//initialisation
	public fb_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilisation
	public void setEmail(String email)
	{
		emailtbox.sendKeys(email);
	}
	public void setPwd(String pwd)
	{
		passtbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginbtn.click();
	}
}
