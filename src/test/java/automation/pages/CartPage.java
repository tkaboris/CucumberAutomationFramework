package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends BasePage{

    //@FindBy(id="remove-sauce-labs-backpack")
    @FindBy(xpath="//*[contains(@id, 'remove')]")
    WebElement removeBtn;

    @FindBy(id="checkout")
    WebElement checkoutBtn;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    WebElement itemName;



    public void verifyPage() {
        Assert.assertTrue("Remove button is missing from cart page",removeBtn.isDisplayed() );
        Assert.assertTrue("Item Name  is missing from cart page", itemName.isDisplayed());
        Assert.assertTrue("Checkout button is missing from cart page",checkoutBtn.isDisplayed() );

    }

    public void clickOnCheckoutBtn() {
        checkoutBtn.click();
    }
}
