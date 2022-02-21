package automation.steps;

import automation.pages.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailSteps {

    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Then("verify user is on product detail page$")
    public void verifyUserIsOnProductDetailPage() {
        productDetailPage.verifyPage();
    }

    @When("user click on add to cart button")
    public void userClickOnAddToCartButton() {
        productDetailPage.clickOnAddToCartBtn();
    }

    @And("click on cart icon")
    public void clickOnCartIcon() {
        productDetailPage.clickOnCartIcon();
    }
}

