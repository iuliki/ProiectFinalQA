package tests.login;

import actions.WaitStrategy;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.time.Duration;

public class Login extends BaseTest {

    @Test(description = "Log in  products")
    public void loginPage() throws InterruptedException {
        candlePage
                .navigateToLogIn()
                .logIn();




        WaitStrategy wait = null;
        wait.waitFor(Duration.ofSeconds(5));


    }
}
