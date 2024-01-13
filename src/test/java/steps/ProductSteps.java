package steps;

import assertions.ProductPageAssertions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps extends ProductPageAssertions {
    @When("user add the product to cart")
    public void userAddTheProductToCart() {
        clickOnAddToCart();
        logMessage("Product is added to cart");
    }

    @Then("product should be present in cart to check out")
    public void productShouldBePresentInCartToCheckOut() {
        clickOnGoToCart();
        logMessage("Navigated to Cart");
    }
}
