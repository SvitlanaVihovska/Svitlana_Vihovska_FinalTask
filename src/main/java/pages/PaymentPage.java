package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{

    @FindBy(xpath = "//button[contains(text(),'Done')]")
    private WebElement DoneButton;
    @FindBy(xpath = "//div[@id='firstName-error']")
    private WebElement FirstNameError;
    @FindBy(xpath = "//div[@id='emailConfirm-error']")
    private WebElement EmailConfirmError;

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDoneButton() {
       DoneButton.click();
    }
    public boolean getFirstNameError(){
        return FirstNameError.isDisplayed();
    }
    public boolean getEmailConfirmError() {
        return EmailConfirmError.isDisplayed();
    }

}
