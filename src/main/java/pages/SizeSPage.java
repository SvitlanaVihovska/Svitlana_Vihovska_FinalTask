package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SizeSPage extends BasePage{
    @FindBy (xpath = "//p[contains(text(),'Pink')]")
    private WebElement PinkColorButton;
    @FindBy(xpath = "//div[@class='b-info']")
    private WebElement ProductDescription;

    public SizeSPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnPinkColorButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", PinkColorButton);
    }
    public void clickOnProductDescription() {
        ProductDescription.click();
    }
}
