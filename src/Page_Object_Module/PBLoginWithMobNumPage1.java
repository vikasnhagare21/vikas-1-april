package Page_Object_Module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PBLoginWithMobNumPage1
{
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement LoginWithPwd;
	
	



}
