package assertions;

import pages.ProductPage;

public class ProductPageAssertions extends ProductPage {

    public void clickOnAddToCart(){
        click(getAddToCartButton());
    }

    public void clickOnGoToCart(){
        click(getGoToCartButton());
    }
}
