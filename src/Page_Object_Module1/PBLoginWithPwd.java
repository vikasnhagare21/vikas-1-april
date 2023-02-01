package Page_Object_Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithPwd 
{
 @FindBy(xpath="//input[@type='password']")private WebElement Pwd;
@FindBy(xpath="//a[text()='Sign in']")private WebElement SignIn;

public PBLoginWithPwd(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void enterPwd()
{
	Pwd.sendKeys("Viman@22");
}
public void clickOnSignIn()
{
	SignIn.click();
}
}
