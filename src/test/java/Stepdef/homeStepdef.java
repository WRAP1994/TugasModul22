package Stepdef;

import Page.homepage;
import io.cucumber.java.en.Then;

public class homeStepdef extends baseTest {
    homepage HomePage;
    @Then("user is on homepage")
    public void userIsOnHomepage() {
        HomePage = new homepage(driver);
        HomePage.validateOnHomePage();
    }
}
