package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactPage extends BasePage{

    @FindBy(xpath = "//input[@id='search_input_element']")
    private WebElement SearchInput;
    @FindBy(xpath = "//span[@class='caption']")
    private WebElement FirstItemRequestList;
    @FindBy(xpath = "//span[@class='caption']")
    private List<WebElement> RequestList;


    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void enterKeywordToSearchInput(final String searchText) {
        SearchInput.clear();
        SearchInput.sendKeys(searchText);
    }
    public WebElement getFirstItemRequestList() {return FirstItemRequestList;
    }
    public void clickRequestListOnFirstProduct() {
        RequestList.get(0).click();
    }
}
