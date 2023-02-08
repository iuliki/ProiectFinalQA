package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;


public class CandlesPage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(CandlesPage.class);



    private final By CandlesSoftwarePage = By.xpath("//header/div[@id='navigation']/nav[@id='main-menu']/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[9]/a[1]/span[1]");
    private final By CandlesSoftwarePage2 = By.xpath("//body/div[@id='wrapper']/div[@id='category-page']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");

    private final By likeCandleButton=  By.xpath("//body/div[@id='wrapper']/div[2]/div[3]/div[1]/div[1]/div[3]/div[7]/a[1]/i[1]");

    private final By loginButton=  By.xpath("//body[1]/div[2]/header[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]/span[1]");

    private final By searchUser = By.xpath("//input[@id='_loginEmail']");
    private final By searchPassword = By.xpath("//input[@id='_loginPassword']");

    private final By right = By.xpath("//header/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]");

    public CandlesPage navigateToCandles(){
        LOG.info("Navigate to cadles category");
        mouseActions.clickOn(CandlesSoftwarePage);
        return new CandlesPage();

    }

    public CandlesPage navigateToCandlesCandles() {
        LOG.info("Navigate to cadles candles category");
        mouseActions.clickOn(CandlesSoftwarePage2);
        return new CandlesPage();
    }
    public CandlesPage likeCandles() {
        LOG.info("Navigate to cadles candles category");
        mouseActions.clickOn(likeCandleButton);

        return new CandlesPage();
    }

    public CandlesPage logIn() {
        String user="buluguiulia@gmail.com";
        String parola="123456";

        LOG.info("", user,parola);
        keyboardActions.clearTheText(searchUser);
        keyboardActions.typeText(searchUser, user);
      //  keyboardActions.typeText(searchUser, String.valueOf(Keys.ENTER));
        keyboardActions.clearTheText(searchPassword);
        keyboardActions.typeText(searchPassword, parola);
        keyboardActions.typeText(searchPassword, String.valueOf(Keys.ENTER));
        wait.waitFor(Duration.ofSeconds(3));

        return this;
    }
    public CandlesPage navigateToLogIn() {
        LOG.info("Navigate to cadles candles category");
        mouseActions.clickOn(loginButton);
        return new CandlesPage();
    }

//    public CandlesPage rightClick() throws InterruptedException {
//        LOG.info("Navigate to cadles candles category");
//        mouseActions.rightClick();
//        return new CandlesPage();
//    }

    public CandlesPage scrollDown() {
        LOG.info("Navigate to napkins");
        mouseActions.scrollDown();
        return new CandlesPage();

    }
}
