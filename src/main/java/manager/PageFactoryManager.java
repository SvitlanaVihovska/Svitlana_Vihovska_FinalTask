package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }
    public ContactPage getContactPage() {return new ContactPage(driver);}
    public WomenClothingPage getWomenClothingPage() {return new WomenClothingPage(driver);}
    public SearchPage getSearchPage() {return new SearchPage(driver);}
    public ProductPage getProductPage() {return new ProductPage(driver);}
    public CategoriesPage getCategoriesPage() {return new CategoriesPage(driver);}
    public ClothingPage getClothingPage() {return new ClothingPage(driver);}
    public SizeSPage getSizeSPage() {return new SizeSPage(driver);}
    public CartPage getCartPage() {return new CartPage(driver);}
    public PopularCategoryPage getPopularCategoryPage() {return new PopularCategoryPage(driver);}
    public BuyItNowPopUp getBuyItNowPopUp() {return new BuyItNowPopUp(driver);}
    public PaymentPage getPaymentPage() {return new PaymentPage(driver);}
}
