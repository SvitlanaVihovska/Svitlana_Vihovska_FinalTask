package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    private WebElement AddToCartButton;
    @FindBy(xpath = "//a[contains(text(),'Buy It Now')]")
    private WebElement BuyItNowButton;
    @FindBy(xpath = "//input[@class='qtyInput']")
    private WebElement QuantityInput;
    @FindBy(xpath = "//div[@id='qtyErrMsg']")
    private WebElement LimitProductPerBuyerError;
    @FindBy(xpath = "//img[@class='errorimg']")
    private WebElement ErrorIcon;
    @FindBy(xpath = "//h2[contains(text(),'Seller information')]")
    private WebElement SellerInformationBlock;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void checkVisibilityAddToCartButton() {
        AddToCartButton.isDisplayed();
    }
    public void clickOnAddToCartButton() {
        AddToCartButton.click();
    }
    public boolean isBuyItNowButtonVisible (){ return BuyItNowButton.isDisplayed();
    }
    public void clickOnBuyItNowButton() {BuyItNowButton.click();}
    public void enterKeywordToQuantityInput(final Integer quantityOfProducts) {
        String quantityOfProductsString  = quantityOfProducts.toString();
        QuantityInput.clear();
        QuantityInput.sendKeys(quantityOfProductsString);
    }
    public boolean getLimitProductPerBuyerError() {
        return LimitProductPerBuyerError.isDisplayed();
    }
    public boolean getErrorIcon() {
        return ErrorIcon.isDisplayed();
    }
    public String getSellerInformationBlock() {
        return SellerInformationBlock.getText();
    }
}
