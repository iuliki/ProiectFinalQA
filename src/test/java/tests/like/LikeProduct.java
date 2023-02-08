package tests.like;

import actions.WaitStrategy;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.time.Duration;

public class LikeProduct extends BaseTest {

    @Test(description = "Plike products")
    public void likeProducts() {
        homePage
                .navigateToNapkins()
                .navigateToNapkinsNapkins()
                .likeLaptop();

        WaitStrategy wait = null;
        wait.waitFor(Duration.ofSeconds(5));
    }
}
