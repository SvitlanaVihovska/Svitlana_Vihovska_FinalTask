package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "//option[@selected]")
    private WebElement QuantityProductsInCart;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getQuantityProductsInCart() {
        return QuantityProductsInCart.getText();
    }
}
