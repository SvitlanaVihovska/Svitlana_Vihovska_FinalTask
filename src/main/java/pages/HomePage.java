package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),' Help & Contact')]")
    private WebElement ContactButton;
    @FindBy(xpath = "//button[contains(text(),'Shop by category')]")
    private WebElement MenuButton;
    @FindBy(xpath = "//table[@role='presentation']//a[contains(text(),'Women')]")
    private WebElement WomenButton;
    @FindBy(xpath = "//a[contains(text(),'United States')]")
    private WebElement ChangeSiteButton;
    @FindBy(xpath = "//a[@aria-label='eBay Russia']")
    private WebElement RussianSiteButton;
    @FindBy(xpath = "//input[@aria-label='Search for anything']")
    private WebElement SearchInput;
    @FindBy(xpath = "//input[@value='Search']")
    private WebElement SearchButton;
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    private WebElement ShopByCategoryButton;
    @FindBy(xpath = "//a[@id='gh-shop-see-all']")
    private WebElement SeeAllCategoriesButton;
    @FindBy (xpath = "//div[contains(@class,'destinations-image')]")
    private WebElement PopularCategoryButton;
    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']/a[contains(text(),'Sports')]")
    private WebElement SportTab;
    @FindBy(xpath = "//a[contains(text(),'Fishing')]")
    private WebElement FishingMenuButton;
    @FindBy(xpath = "//select[contains(@class,'gh-sb')]")
    private WebElement CategoriesButtonInSearchInput;
    @FindBy(xpath = "//option[@value='11233']")
    private WebElement MusicCategory;
    @FindBy(xpath = "//a[@class='hl-item__link']")
    private List<WebElement> ListDailyDealsProducts;
    @FindBy(xpath = "//div[contains(@class,'container--controls')]//li[contains(@class,'snap-point')]")
    private List<WebElement> RecentlyViewedItemslist;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }
    public void clickOnContactButton() {
        ContactButton.click();
    }
    public void clickOnMenuButton() {
        MenuButton.click();
    }
    public void clickOnWomenButton() {
        WomenButton.click();
    }
    public void clickOnChangeSiteButton() {
        ChangeSiteButton.click();
    }
    public void clickOnRussianSiteButton() {
        RussianSiteButton.click();
    }
    public void enterKeywordToSearchInput(final String searchText) {
        SearchInput.clear();
        SearchInput.sendKeys(searchText);
    }
    public void clickOnSearchButton() {
        SearchButton.click();
    }
    public void clickOnShopByCategoryButton() {
        ShopByCategoryButton.click();
    }
    public void clickOnSeeAllCategoriesButton() {
        SeeAllCategoriesButton.click();
    }
    public void clickOnPopularCategoryButton() {PopularCategoryButton.click();}
    private WebElement SportTab() {
        return SportTab;
    }
    public void mouseHoverOnSportTab(){
        Actions action = new Actions(driver);
        action.moveToElement(SportTab()).perform();
    }
    public void clickOnFishingMenuButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", FishingMenuButton);
    }
    public void clickOnCategoriesButtonInSearchInput() {
        CategoriesButtonInSearchInput.click();
    }
    public void clickOnMusicCategory() {
        MusicCategory.click();
    }
    public WebElement getFirstItemInListDailyDealsProducts() {
        return ListDailyDealsProducts.get(0);
    }
    public void clickOnFirstItemInListDailyDealsProducts() {
        getFirstItemInListDailyDealsProducts().click();
    }
    public int sizeRecentlyViewedItemslist() {
        return RecentlyViewedItemslist.size();
    }
}
