package tests.orders;

import actions.WaitStrategy;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.time.Duration;

public class OrderTest extends BaseTest {

    @Test(description = "Place order")
    public void placeOrder() {
        homePage
                .navigateToNapkins()
                .navigateToNapkinsNapkins()
                .addNapkinsToCart()
                .verifyCard()
                .increesd();


        WaitStrategy wait = null;
        wait.waitFor(Duration.ofSeconds(5));
    }

//    @Test(description = "Place order")
//    public void placeOrderWithNewCustomer() {
//        homePage
//                .navigateToLaptops()
//                .navigateToLaptopsLaptops()
//                .addLaptopToCart();
//    }

//    @Test(description = "Place order")
//    public void placeOrderWithFreeShipping() {
//        homePage
//                .navigateToLaptops()
//                .navigateToLaptopsLaptops()
//                .addLaptopToCart();
//    }
}
