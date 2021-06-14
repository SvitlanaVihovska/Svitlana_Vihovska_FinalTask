package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyItNowPopUp extends BasePage{
    @FindBy (xpath = "//button[@id='sbin-gxo-btn']")
    private WebElement CheckOutAsGuestButton;

    public BuyItNowPopUp(WebDriver driver) {
        super(driver);
    }

    public void clickOnCheckOutAsGuestButton() {
        CheckOutAsGuestButton.click();
    }
}
