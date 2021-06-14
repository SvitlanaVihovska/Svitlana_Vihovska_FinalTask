package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoriesPage extends BasePage{
    @FindBy(xpath = "//img[@alt=\"Women's Clothing\"]")
    private WebElement WomenClothingButton;
    @FindBy(xpath = "//div[@class='s-item__image-helper']")
    private List<WebElement> ProductItem;
    @FindBy(xpath = "//a[@id='gh-la']")
    private WebElement LogoButton;

    public CategoriesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWomenClothingButton() {
        return WomenClothingButton;
    }
    public void clickOnWomenClothingButton() {
        WomenClothingButton.click();
    }
    public WebElement getFirstProductItem() {
        return ProductItem.get(0);
    }
    public void clickOnSecondProductItem() {
        getFirstProductItem().click();
    }
    public void clickOnLogoButton() {
        LogoButton.click();
    }
}
