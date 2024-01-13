package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.WebElementOperations;

import java.util.List;

public class HomePage extends WebElementOperations {

    {
        PageFactory.initElements(getDriver(),this);
    }

    public WebElement getShopAllDealsLink() {
        return shopAllDealsLink;
    }

    public List<WebElement> getProducts() {
        getWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(products));
        return products;
    }

    @FindBy(xpath = "//a[text()='Shop all deals']")
    private WebElement shopAllDealsLink;

    @FindAll({
            @FindBy(css = "div[data-testid='grid-deals-container']>div")
    } )
    private List<WebElement> products;
}
