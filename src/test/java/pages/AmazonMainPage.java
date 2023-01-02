package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AmazonMainPage extends CommonMethods {

    @FindBy(id = "nav-hamburger-menu")
    public WebElement AllBtn;

    @FindBy(xpath = "//div[text()='TV, Appliances, Electronics']")
    public WebElement TvApplianceElectronicsBtn;

    @FindBy(xpath = "//a[text()='Televisions']")
    public WebElement TelevisionBtn;


    public AmazonMainPage(){
        PageFactory.initElements(driver, this);
    }
}
