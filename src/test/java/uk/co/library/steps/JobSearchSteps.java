package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }
    @And("I enter Job Title {string}")
    public void iEnterJobTitle(String jobTitle) throws InterruptedException {
        new HomePage().enterJobTitle(jobTitle);
    }
    
    @And("I enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
        
    }


    @And("I select Distance {string}")
    public void iSelectDistance(String distance) throws InterruptedException {
        new HomePage().selectDistance(distance);
        
    }

    @And("I click on more search option link")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();

        
    }

    @And("I enter Min Salary {string}")
    public void iEnterMinSalary(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
        
    }

    @And("I enter Max Salary {string}")
    public void iEnterMaxSalary(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
        
    }

    @And("I enter Salary Type {string}")
    public void iEnterSalaryType(String sType) {
        new HomePage().selectSalaryType(sType);
    }

    @And("I select Job Type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
        
    }

    @And("I Click on find JOb Button")
    public void iClickOnFindJObButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("Verify the {string}")
    public void verifyThe(String result) throws InterruptedException {
        Assert.assertTrue(new ResultPage().verifyTheResults());
    }
}
