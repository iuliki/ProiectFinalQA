package tests.like;

import actions.WaitStrategy;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.time.Duration;

public class LikeCandle extends BaseTest {

    @Test(description = "Like candles")
    public void likeCandles() {
        candlePage
                .navigateToCandles()
                .navigateToCandlesCandles()
                .likeCandles();



        WaitStrategy wait = null;
        wait.waitFor(Duration.ofSeconds(5));
    }}
