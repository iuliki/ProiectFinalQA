package pages;

import actions.Actions;
import actions.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import reporting.ExtentManager;
import util.CustomLogger;

import java.time.Duration;

public class HomePage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);
    private final By searchBar = By.xpath("//input[@id='_autocompleteSearchMainHeader']");

    private final By napkinsCategoryButton = By.xpath("//header/div[@id='navigation']/nav[@id='main-menu']/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[1]/a[1]/span[1]");

    public HomePage searchProduct(String product) {
        LOG.info("Search product: {}", product);
        keyboardActions.clearTheText(searchBar);
        keyboardActions.typeText(searchBar, product);
        keyboardActions.typeText(searchBar, String.valueOf(Keys.ENTER));
        wait.waitFor(Duration.ofSeconds(3));
        return this;
    }

    public LaptopsTabletsSoftwarePage navigateToNapkins(){
        LOG.info("Navigate to napkins category");
        mouseActions.clickOn(napkinsCategoryButton);
        return new LaptopsTabletsSoftwarePage();

    }


}
