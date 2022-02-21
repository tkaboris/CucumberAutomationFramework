package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductDetailPage extends BasePage{

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    WebElement productTitle;

    @FindBy(xpath = "//img[@class='inventory_details_img']")
    WebElement productImage;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    WebElement addToCartBtn;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartLink;

    public void verifyPage() {
        Assert.assertTrue("Product title is missing from page", productTitle.isDisplayed());
        Assert.assertTrue("Product Image  is missing from page", productImage.isDisplayed());
        Assert.assertTrue("cartButton is missing from page", addToCartBtn.isDisplayed());

    }

    public void clickOnAddToCartBtn() {
        addToCartBtn.click();
    }

    public void clickOnCartIcon() {
        cartLink.click();
    }
}
