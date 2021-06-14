package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenClothingPage extends BasePage{

    @FindBy(xpath = "//div[contains(@class,'control--legacy')]//div[contains(text(),'Best Match')]")
    private WebElement SortButton;
    @FindBy(xpath = "//span[contains(text(),'lowest first')]")
    private WebElement SortOfLowestFirst;
    @FindBy(xpath = "//h3[@class='s-item__title']")
    private WebElement CheapestProductsOfWomenClothing;

    public WomenClothingPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSortButton() {
        SortButton.click();
    }
    public void clickOnSortOfLowestFirst() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", SortOfLowestFirst);
    }
    public WebElement getFirsCheapestProductsOfWomenClothing() {
        return CheapestProductsOfWomenClothing;
    }
    public void clickOnFirsCheapestProductsOfWomenClothing(){
        CheapestProductsOfWomenClothing.click();
    }
}
