package steps;

import assertions.HomePageAssertions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomeSteps extends HomePageAssertions {

    @Given("user login to Amazon website")
    public void userLoginToAmazonWebsite() {
        getDriver().get("https://amazon.ca");
        logMessage("Amazon website is launched");
    }

    @And("user selects a product")
    public void userSelectsAProduct() {
        new HomePageAssertions().clickOnShopAllDeals();
        new HomePageAssertions().clickOnRandomProduct();
        logMessage("Random Product is selected");
    }
}
