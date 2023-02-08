package tests.scroll;

import actions.WaitStrategy;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.time.Duration;

public class scrollPage extends BaseTest {

    @Test(description = "Scroll page")
    public void scrollPage() throws InterruptedException {
        candlePage
                .navigateToCandles()
                .scrollDown();

        WaitStrategy wait = null;
        wait.waitFor(Duration.ofSeconds(5));


    }
}
