package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PopularCategoryPage extends BasePage{

    @FindBy (xpath = "//h3[@class='s-item__title']")
    private List<WebElement> ProductList;

    public PopularCategoryPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductList() {
        return ProductList.get(2);
    }
    public void clickOnThirdProduct() {
        getProductList().click();
    }
}
