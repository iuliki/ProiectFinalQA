package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class NapkinsPage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(NapkinsPage.class);

    private final By addToCart = By.xpath("//a[contains(text(),'Adauga in cos')]");

    private final By verifyCard= By.xpath("//header/div[2]/div[1]/div[1]/div[3]/ul[1]/li[5]/a[1]/i[1]");
    private final By likeLaptop1 = By.xpath("//body[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");

    public CartPage addNapkinsToCart(){
        LOG.info("Add napkins to cart");
        mouseActions.clickOn(addToCart);
        wait.waitFor(Duration.ofSeconds(5));
        return new CartPage();
    }
    public CartPage likeLaptop(){
        LOG.info("like Laptop");
        mouseActions.clickOn(likeLaptop1);
        wait.waitFor(Duration.ofSeconds(5));
        return new CartPage();
    }
    public CartPage verifyCard(){
        LOG.info("Verify the actual card");
        mouseActions.clickOn(addToCart);
        wait.waitFor(Duration.ofSeconds(5));
        return new CartPage();
    }
}
