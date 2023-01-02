package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class TelevisionPage extends CommonMethods {
    @FindBy(xpath = "//span[text()='Samsung']")
    public WebElement SamsungBtn;

    @FindBy(xpath = "//span[text()='Featured']")
    public WebElement FeaturedBtn;

    @FindBy(xpath = "//a[text()='Price: High to Low']")
    public WebElement HighToLowBtn;

    @FindBy(xpath = "(//div[@class='s-card-container s-overflow-hidden aok-relative puis-expand-height puis-include-content-margin puis s-latency-cf-section s-card-border'])[2]")
    public WebElement SecondHighestLink;

    @FindBy(xpath = "//ul[@class='a-unordered-list a-vertical a-spacing-mini']")
    public WebElement AboutThisItem;

    public TelevisionPage(){
        PageFactory.initElements(driver, this);
    }
}
