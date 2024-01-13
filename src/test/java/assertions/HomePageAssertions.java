package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;
import utilities.RandomUtils;

public class HomePageAssertions extends HomePage {


    public void clickOnShopAllDeals(){
        click(getShopAllDealsLink());
    }

    public void clickOnRandomProduct() {
        WebElement product = getProducts().get(new RandomUtils().getRandomNumber(getProducts().size()));
        click(product.findElements(By.tagName("a")).get(1));
    }
}
