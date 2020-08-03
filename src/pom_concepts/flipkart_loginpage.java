package pom_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_loginpage 
{
	//declaration
	@FindBy(xpath="//a[.='Login']")
	private WebElement loginlink;
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement emailtbox;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdtbox;
	@FindBy(xpath="//span[.='Login']")
	private WebElement loginbtn;
	//initialisation
	public flipkart_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilisation
	public void clicklogin1ink()
	{
		loginlink.click();
	}
	public void enterEmail(String email)
	{
		emailtbox.sendKeys(email);
	}
	public void enterPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clickLoginButton()
	{
		loginbtn.click();
	}
}
