package starter.stepdefinitions;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;


public class LoginTest {


    @Steps
    LoginPage loginPage;


    @Test
    public void testLogin() {
        loginPage.open();
        loginPage.enterUsername("email");
        loginPage.enterPassword("password");
        loginPage.clickLoginButton();
    }
}
