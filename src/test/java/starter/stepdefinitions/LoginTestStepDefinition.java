package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.LoginPage;


public class LoginTestepDefinitions {

    LoginPage loginPage= new LoginPage;

    @Given("{actor} am on the login page")
    public void onTheLoginPage(Actor actor) {
        actor.attemptsTo(
            Open.browserOn().the(LoginPage.class)
        );
    }

    @When("{actor} enter {string} as a email")
    public void enterTheEmail(Actor actor, String email) {
        actor.attemptsTo(
            Enter.theValue(email).into(loginPage.usernameInput)
        );
    }

    @When("{actor} enter {string} as a password")
    public void enterThePassword(Actor actor, String password) {
        actor.attemptsTo(
            Enter.theValue(password).into(loginPage.passwordInput)
        );
    }

    @When("{actor} click the login button")
    public void clickLoginButton(Actor actor) {
        actor.attemptsTo(
            Click.on(loginPage.loginButton)
        );
    }

    @Then("{actor} should be logged in successfully")
    public void shouldBeLoggedIn(Actor actor) {
        actor.attemptsTo(
            SuccessfulLogin.toHomePage(),
            Ensure.that(SuccessfulLogin.isLoginButtonNotVisible(), is(true))
        );
    }
}
