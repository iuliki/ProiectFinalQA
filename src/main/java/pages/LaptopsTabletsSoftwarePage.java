package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

public class LaptopsTabletsSoftwarePage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(LaptopsTabletsSoftwarePage.class);

    private final By napkinsNapkinsButton = By.xpath("//body/div[@id='wrapper']/div[@id='category-page']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
    private final By candlesButton = By.xpath("//header/div[@id='navigation']/nav[@id='main-menu']/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[9]/a[1]/span[1]");
    private final By candlesButton2 = By.xpath("//body/div[@id='wrapper']/div[@id='category-page']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");

    public NapkinsPage navigateToNapkinsNapkins() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(napkinsNapkinsButton);
        return new NapkinsPage();

    }

    public CandlesPage navigateToCandles() {
        LOG.info("Navigate to condles");
        mouseActions.clickOn(candlesButton);
        return new CandlesPage();

    }

    public CandlesPage navigateToCandlesCandles() {
        LOG.info("Navigate to condles");
        mouseActions.clickOn(candlesButton2);
        return new CandlesPage();

    }


}
