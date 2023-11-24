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

    @Then("user is on homepage see error catalog")
    public void userIsOnHomepageSeeErrorCatalog() {
    }

    @Then("user is on homepage see error one picture catalog")
    public void userIsOnHomepageSeeErrorOnePictureCatalog() {
    }
}
