package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClothingPage extends BasePage{
    @FindBy(xpath = "//p[contains(text(),'Dresses')]")
    private WebElement DressesCategory;
    @FindBy(xpath = "//img[@alt='S']")
    private WebElement SSizeButton;

    public ClothingPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDressesCategory() {
        DressesCategory.click();
    }
    public WebElement getSSizeButton() {
        return SSizeButton;
    }
    public void clickOnSSizeButton() {
        getSSizeButton().click();
    }
}
