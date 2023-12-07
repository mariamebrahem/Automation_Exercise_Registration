package CucumberRegistration;

import Page.SignUpPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UserRegister {
    WebDriver driver;
    SignUpPage signUpPageObj;

    @Given("Launch browser and Navigate to url")
    public void openbrowser() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        Thread.sleep(2000);
        signUpPageObj =new SignUpPage(driver);
    }
    @Then("Verify that home page is visible successfully")
    public void homepage(){
        Assert.assertTrue(signUpPageObj.homepagevisability());
    }
    @When("Click on Signup button")
    public void clickonsignup(){
        signUpPageObj.signupicon();
    }
    @Then("Verify 'New User Signup!' is visible")
    public void newusersignup(){
        Assert.assertTrue(signUpPageObj.signupuservisability(),"New User Signup!");
    }
    @When("Enter name and email address")
    public void enterdata(){
        signUpPageObj.Usernamefield("Mariam Ibrahem");
        signUpPageObj.Emailaddress("mariamebrahem1112@gmail.com");
    }
    @And("Click 'Signup' button")
    public void clickonbutton(){
        signUpPageObj.SignupButton();
    }
    @Then("Verify that 'ENTER ACCOUNT INFORMATION' is visible")
    public void verifyaccountinformation(){
        Assert.assertTrue(signUpPageObj.enteAccountInformationVisability(),"ENTER ACCOUNT INFORMATION");
    }
    @When("Fill details and select checkboxes")
    public void filldetails(){
        signUpPageObj.title();
        signUpPageObj.password("M@riom12");
        signUpPageObj.days();
        signUpPageObj.month();
        signUpPageObj.year();
        signUpPageObj.Checkbox1();
        signUpPageObj.Checkbox2();
        signUpPageObj.firstname("mariam");
        signUpPageObj.lastname("ibrahem");
        signUpPageObj.company("Farma");
        signUpPageObj.address1("street,cairo,egypt");
        signUpPageObj.country();
        signUpPageObj.state("single");
        signUpPageObj.city("cairo");
        signUpPageObj.zipcode("3753450");
        signUpPageObj.mobile_number("01204067227");
    }
    @And("Click 'Create Account button'")
    public void createbutton(){
        signUpPageObj.CreateAccountButton();
    }
    @Then("Verify that 'ACCOUNT CREATED!' is visible")
    public void accountcreatedmsg(){
        Assert.assertTrue(signUpPageObj.accountcreatedVisability(),"ACCOUNT CREATED!");
    }
    @When("Click 'Continue' button")
    public void continuebutton(){
        signUpPageObj.Continuebutton();
    }
    @Then("Verify that 'Logged in as username' is visible")
    public void loggedinmsg(){
        Assert.assertTrue(signUpPageObj.loggedin(),"Logged in as username");
    }
    @When("Click 'Delete Account' button")
    public void deleteaccount(){
        signUpPageObj.deleteaccount();
    }
    @Then("Verify that 'ACCOUNT DELETED!' is visible")
    public void accountdeletedmsg(){
        Assert.assertTrue(signUpPageObj.AccountdeletedVisability(),"ACCOUNT DELETED!");
    }
    @And("Click on 'Continue' button")
    public void clickoncontinueButton(){
        signUpPageObj.Continuebutton();
    }
    @After
    public void close(){
        driver.quit();
    }

}
