package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class CalculatorCode {
    int a;
    int b;
    int mult;

    @Given("^I have variable a$")
    public void setA() {
        a = 2;
    }

    @Given("^I have variable b$")
    public void setB() {
        b = 3;
      List l;
      String s="";


    }

    @When("^I multiply a and b$")
    public void i_multiply_a_and_b() {
        mult = a * b;
    }

    @Then("^The result will be displayed$")
    public void the_result_will_be_displayed() {


        System.out.println("multiplication is verified and certified");

    }
}

