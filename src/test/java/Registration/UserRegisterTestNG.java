package Registration;

import Page.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserRegisterTestNG {
    WebDriver driver;
    SignUpPage signUpPageObj;

    @BeforeMethod
    public void OpenBrowser() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        Thread.sleep(2000);
        signUpPageObj =new SignUpPage(driver);

    }

    @Test
    public void RegisterTestCases(){
       Assert.assertTrue(signUpPageObj.homepagevisability());
        signUpPageObj.signupicon();
       Assert.assertTrue(signUpPageObj.signupuservisability(),"New User Signup!");
        signUpPageObj.Usernamefield("Mariam Ibrahem");
        signUpPageObj.Emailaddress("mariamebrahem1112@gmail.com");
        signUpPageObj.SignupButton();
       Assert.assertTrue(signUpPageObj.enteAccountInformationVisability(),"ENTER ACCOUNT INFORMATION");
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
        signUpPageObj.CreateAccountButton();
        Assert.assertTrue(signUpPageObj.accountcreatedVisability(),"ACCOUNT CREATED!");
        signUpPageObj.Continuebutton();
       Assert.assertTrue(signUpPageObj.loggedin(),"Logged in as username");
        signUpPageObj.deleteaccount();
       Assert.assertTrue(signUpPageObj.AccountdeletedVisability(),"ACCOUNT DELETED!");
        signUpPageObj.Continuebutton();



    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();

    }

}
