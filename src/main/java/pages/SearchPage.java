package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//h3[contains(@class,'null-search')]")
    private WebElement NullSearchText;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getNullSearchText() {return NullSearchText.getText();
    }
}
