package starter.navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://ecommerce-playground.lambdatest.io/index.php?route=account/login")
public class LoginPage extends PageObject {


    @FindBy(name="email")
    WebElement usernameInput;

    @FindBy(name="password")
    WebElement passwordInput;

    @FindBy(css="button[type='submit'][value='Login']")
    WebElement loginButton;

    @FindBy(xpath="//*[@id="account-login"]/div[1]")
    WebElement errorMessage;


    public void enterUsername(String username) {
        usernameInput.typeInto(username);
    }


    public void enterPassword(String password) {
        passwordInput.typeInto(password);
    }


    public void clickLoginButton() {
        loginButton.click();
    }
}

