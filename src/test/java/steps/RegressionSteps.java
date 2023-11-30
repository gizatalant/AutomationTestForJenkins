package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegressionSteps {

    @Given("I run Cucumber test")
    public void i_run_cucumber_test() {
       for (int i = 0; i < 100; i++){
           System.out.println("This is Cucumber test!");
       }
    }
    @Then("verify this is Cucumber")
    public void verify_this_is_cucumber() {
        for (int i = 0; i < 20; i++){
            System.out.println("Indeed this Cucumber!");
        }
    }
}
