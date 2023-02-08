package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;;


public class CartPage extends Actions {


        private static final Logger LOG = CustomLogger.INSTANCE.getLogger(CartPage.class);

        private final By cartButton = By.xpath("//a[contains(text(),'Finalizeaza Comanda')]");
        private final By plusButton = By.xpath("//body/div[@id='wrapper']/div[@id='shoppingcart']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[2]/li[1]/div[2]/div[1]/a[2]");
    public CartPage verifyCard() {
            LOG.info("Navigate to napkins");
            mouseActions.clickOn(cartButton);
            return new CartPage();

    }

    public CartPage increesd() {
        LOG.info("Navigate to napkins");
        mouseActions.doubleClickOn(plusButton);
        return new CartPage();

    }


}
