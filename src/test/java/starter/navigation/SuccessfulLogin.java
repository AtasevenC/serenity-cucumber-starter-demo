package starter.navigation;

import net.serenitybdd.screenplay.Performable;

@DefaultUrl("https://ecommerce-playground.lambdatest.io/index.php?route=account/account")
public class SuccessfulLogin implements Performable {

    LoginPage loginPage= new LoginPage;

    public static Performable toHomePage() {
        return instrumented(SuccessfulLogin.class);
    }
      public static ExpectedCondition<Boolean> isLoginButtonNotVisible() {
        return ExpectedConditions.invisibilityOfElementLocated(loginPage.loginButton);
    }
}
