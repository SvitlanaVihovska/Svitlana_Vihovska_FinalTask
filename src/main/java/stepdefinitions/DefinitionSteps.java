package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 30;
    WebDriver driver;
    HomePage homePage;
    ContactPage contactPage;
    WomenClothingPage womenClothingPage;
    ProductPage productPage;
    SearchPage searchPage;
    CategoriesPage categoriesPage;
    SizeSPage sizeSPage;
    CartPage cartPage;
    PageFactoryManager pageFactoryManager;
    ClothingPage clothingPage;
    PopularCategoryPage popularCategoryPage;
    BuyItNowPopUp buyItNowPopUp;
    PaymentPage paymentPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @When("User clicks Contact button")
    public void clicksContactButton() {
        homePage = pageFactoryManager.getHomePage();
        homePage.clickOnContactButton();
    }

    @And("User checks that current url contains {string}")
    public void checkCurrentUrl(final String searchUrl) {
        assertTrue(driver.getCurrentUrl().contains(searchUrl));
    }

    @And("User makes search by keyword {string}")
    public void enterKeywordToSearchField(final String keyword) {
    contactPage = pageFactoryManager.getContactPage();
    contactPage.enterKeywordToSearchInput(keyword);
    }

    @And("User clicks on first request item")
    public void clickOnFirstRequestItem() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, contactPage.getFirstItemRequestList());
        contactPage.clickRequestListOnFirstProduct();
    }

    @And("User clicks on Menu button")
    public void clickOnMenuButton() {
        homePage.clickOnMenuButton();
    }

    @And("User clicks on Women button menu")
    public void clickOnWomenButtonMenu() {
        homePage.clickOnWomenButton();
    }

    @When("User clicks on Sort button")
    public void clickOnSortButton() {
        womenClothingPage = pageFactoryManager.getWomenClothingPage();
        womenClothingPage.clickOnSortButton();
    }

    @And("User clicks on sort of lowest first")
    public void clickOnSortOfLowestFirst() {
        womenClothingPage.clickOnSortOfLowestFirst();
    }

    @And("User clicks on first cheapest products of women clothing")
    public void clickOnFirstCheapestProductsOfWomenClothing() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT,womenClothingPage.getFirsCheapestProductsOfWomenClothing());;
        womenClothingPage.clickOnFirsCheapestProductsOfWomenClothing();
    }

    @And("User checks that Add to cart button is visibility")
    public void checkThatAddToCartButtonIsVisibility() {
        productPage = pageFactoryManager.getProductPage();
        productPage.checkVisibilityAddToCartButton();
    }

    @Then("User clicks on Add to cart button")
    public void clickOnAddToCartButton() {
        productPage.clickOnAddToCartButton();
    }

    @And("User clicks on Change Site Button")
    public void clickOnChangeSiteButton() {
        homePage.clickOnChangeSiteButton();
    }

    @When("User clicks on Russian Site Button")
    public void clickOnRussianSiteButton() {
        homePage.clickOnRussianSiteButton();
    }

    @And("User enter search by keyword {string}")
    public void userEnterSearchByKeywordKeyword(final String keyword) {
        homePage.enterKeywordToSearchInput(keyword);
    }

    @When("User clicks on Search Button")
    public void userClicksOnSearchButton() {
        homePage.clickOnSearchButton();
    }

    @Then("User checks that text about found nothing is visible {string}")
    public void checkThatTextAboutFoundNothingIsVisible(final String expectedText) {
        searchPage = pageFactoryManager.getSearchPage();
        assertEquals(searchPage.getNullSearchText(),expectedText);
    }

    @And("User clicks on Shop by category button")
    public void clickOnShopByCategoryButton() {
        homePage.clickOnShopByCategoryButton();
    }

    @And("User clicks on See all categories button")
    public void userClicksOnSeeAllCategoriesButton() {
        homePage.clickOnSeeAllCategoriesButton();
    }

    @When("User clicks on Women's Clothing button")
    public void clickOnWomenClothingButton() {
        categoriesPage = pageFactoryManager.getCategoriesPage();
        categoriesPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,categoriesPage.getWomenClothingButton());
        categoriesPage.clickOnWomenClothingButton();
    }

    @And("User clicks on S size")
    public void clickOnSSize() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        clothingPage.clickOnSSizeButton();
    }

    @And("User clicks on Dresses Category")
    public void clickOnDressesCategory() {
        clothingPage = pageFactoryManager.getClothingPage();
        clothingPage.clickOnDressesCategory();
    }

    @And("User clicks on Pink color button")
    public void clickOnPinkColorButton() {
       sizeSPage = pageFactoryManager.getSizeSPage();
       sizeSPage.clickOnPinkColorButton();
    }

    @And("User clicks on product description")
    public void userClicksOnProductDescription () {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sizeSPage.clickOnProductDescription();
    }

    @Then("User checks buying product now button")
    public void checkBuyingProductNow() {
       productPage = pageFactoryManager.getProductPage();
        assertTrue(productPage.isBuyItNowButtonVisible());
    }

    @And("User changes quantity of products on {int}")
    public void changeQuantityOfProductsOnQuantityOfProducts(final int quantityOfProducts) {
        productPage = pageFactoryManager.getProductPage();
        productPage.enterKeywordToQuantityInput(quantityOfProducts);
    }

    @And("User checks that quantity of products in cart is {string}")
    public void checkThatQuantityOfProductsInCartIsQuantityOfProducts(final String quantityOfProducts) {
       cartPage = pageFactoryManager.getCartPage();
        assertEquals(cartPage.getQuantityProductsInCart(),quantityOfProducts);
    }

    @And("User clicks on Popular Category Button")
    public void clickOnPopularCategoryButton() {
        homePage.clickOnPopularCategoryButton();
    }

    @And("User opens Product page")
    public void openProductPage() {
        popularCategoryPage = pageFactoryManager.getPopularCategoryPage();
        popularCategoryPage.clickOnThirdProduct();
    }

    @And("User clicks on Buy it now button")
    public void userClicksOnBuyItNowButton() {
        productPage = pageFactoryManager.getProductPage();
        productPage.clickOnBuyItNowButton();
    }

    @When("User clicks on check out as guest button")
    public void clickOnCheckOutAsGuestButton() {
        buyItNowPopUp = pageFactoryManager.getBuyItNowPopUp();
        buyItNowPopUp.clickOnCheckOutAsGuestButton();
    }

    @And("User clicks on Done button")
    public void clickOnDoneButton() {
        paymentPage = pageFactoryManager.getPaymentPage();
        paymentPage.clickOnDoneButton();
    }

    @Then("User checks errors")
    public void checkErrors() {
        assertTrue(paymentPage.getFirstNameError());
        assertTrue(paymentPage.getEmailConfirmError());
    }

    @Then("User checks Limit Product Per Buyer Error")
    public void checkLimitProductPerBuyerError() {
        assertTrue(productPage.getLimitProductPerBuyerError());
    }

    @And("User checks that Error icon is displayed")
    public void checkThatErrorIconIsDisplayed() {
        assertTrue(productPage.getErrorIcon());
    }

    @And("User hovers mouse on Sport tab")
    public void hoverMouseOnSportTab() {
        homePage.mouseHoverOnSportTab();
    }

    @And("User clicks on Fishing menu button")
    public void clickOnFishingMenuButton() {
        homePage.clickOnFishingMenuButton();
    }

    @And("User opens Product item")
    public void openProductItem() {
        categoriesPage = pageFactoryManager.getCategoriesPage();
        categoriesPage.clickOnSecondProductItem();
    }

    @And("User clicks on Categories button in Search input")
    public void clickOnCategoriesButtonInSearchInput() {
        homePage.clickOnCategoriesButtonInSearchInput();
    }

    @And("User chooses Music category")
    public void chooseMusicCategory() {
        homePage.clickOnMusicCategory();
    }

    @Then("User checks whether current url contains {string}")
    public void checkThatCurrentUrlContainsMusic(final String expectedUrl) {
        assertTrue(driver.getCurrentUrl().contains(expectedUrl));
    }

    @And("User clicks on Daily Deals Product")
    public void clickOnDailyDealsProduct() {
        homePage.clickOnFirstItemInListDailyDealsProducts();
    }

    @When("User clicks on Logo")
    public void clickOnLogo() {
        categoriesPage = pageFactoryManager.getCategoriesPage();
        categoriesPage.clickOnLogoButton();
    }

    @Then("User checks that opened product is in Recently Viewed Items list")
    public void checkThatOpenedProductIsInRecentlyViewedItemsList() {
        assertEquals(1,homePage.sizeRecentlyViewedItemslist());
    }

    @Then("User checks that product has Seller Information")
    public void checkThatProductHasSellerInformation() {
        productPage = pageFactoryManager.getProductPage();
        assertEquals("Seller information", productPage.getSellerInformationBlock());
    }

    @After
    public void tearDown() {
        driver.close();
    }
}

