package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebElementOperations;

public class ProductPage extends WebElementOperations {

    {
        PageFactory.initElements(getDriver(),this);
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getGoToCartButton() {
        return goToCartButton;
    }

    @FindBy(css = "input[value='Add to Cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[contains(@href,'cart?ref_=sw_gtc')]")
    private WebElement goToCartButton;
}
