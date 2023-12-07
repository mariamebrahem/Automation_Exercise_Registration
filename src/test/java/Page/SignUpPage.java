package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    WebDriver driver;

    By homepageVisability =By.cssSelector(".shop-menu");
    By signupicon =By.xpath("//a[@href=\"/login\"]");
    By signUpuserVisability= By.cssSelector(".signup-form");
    By usernamefield= By.xpath("//input[@type=\"text\"]");
    By emailaddress =By.xpath("(//input[@type=\"email\"])[2]");
    By signupButton =By.xpath("(//button[@type=\"submit\"])[2]");
    By enteAccountInformationVisability=By.cssSelector(".text-center");
    By Title =By.cssSelector("#id_gender2");
    By password =By.cssSelector("#password");
    By days =By.id("days");
    By month =By.id("months");
    By year =By.id("years");
    By checkbox1 = By.id("newsletter");
    By checkbox2= By.id("optin");
    By firstname= By.id("first_name");
    By lastname =By.id("last_name");
    By company =By.id("company");
    By Address1 =By.id("address1");
    By country=By.id("country");
    By state =By.id("state");
    By city =By.id("city");
    By zipcode =By.id("zipcode");
    By mobile_number=By.id("mobile_number");
    By createAccountButton=By.xpath("(//button[@type=\"submit\"])[1]");
    By accountcreatedVisability=By.xpath("//h2[@data-qa=\"account-created\"]");
    By continuebutton =By.cssSelector(".btn-primary");
    By loggedin =By.cssSelector(".fa-user");
    By deleteaccount= By.xpath("//a[@href=\"/delete_account\"]");
    By accountdeletedVisability=By.xpath("//h2[@data-qa=\"account-deleted\"]");





    public SignUpPage (WebDriver driver){
        this.driver=driver;
    }

    public boolean homepagevisability(){
        return driver.findElement(homepageVisability).isDisplayed();
    }
    public void signupicon(){
        driver.findElement(signupicon).click();
    }
    public boolean signupuservisability(){
        return driver.findElement(signUpuserVisability).isDisplayed();
    }

    public void Usernamefield(String user){
        driver.findElement(usernamefield).sendKeys(user);
    }
    public void Emailaddress(String email){
        driver.findElement(emailaddress).sendKeys(email);
    }
    public void SignupButton(){
        driver.findElement(signupButton).click();
    }
    public boolean enteAccountInformationVisability(){
        return driver.findElement(enteAccountInformationVisability).isDisplayed();
    }
    public void title(){
        driver.findElement(Title).click();
    }
    public void password(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void days(){
        Select options =new Select(driver.findElement(days));
        options.selectByIndex(11);
    }
    public void month(){
        Select options=new Select(driver.findElement(month));
        options.selectByVisibleText("December");
    }
    public void year(){
        Select options=new Select(driver.findElement(year));
        options.selectByVisibleText("1999");
    }
    public void Checkbox1(){
        driver.findElement(checkbox1).click();
    }
    public void Checkbox2(){
        driver.findElement(checkbox2).click();
    }
    public void firstname(String first){
        driver.findElement(firstname).sendKeys(first);
    }
    public void lastname(String last){
        driver.findElement(lastname).sendKeys(last);
    }
    public void company(String comp){
        driver.findElement(company).sendKeys(comp);
    }
    public void address1(String address){
        driver.findElement(Address1).sendKeys(address);
    }
    public void country(){
       Select options= new Select(driver.findElement(country));
       options.selectByVisibleText("Canada");
    }
    public void state(String st){
        driver.findElement(state).sendKeys(st);
    }
    public void city(String cit){
        driver.findElement(city).sendKeys(cit);
    }
    public void zipcode(String code){
        driver.findElement(zipcode).sendKeys(code);
    }
    public void mobile_number(String number){
        driver.findElement(mobile_number).sendKeys(number);
    }
    public void CreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }
    public boolean accountcreatedVisability(){
      return driver.findElement(accountcreatedVisability).isDisplayed();
    }
    public void Continuebutton(){
        driver.findElement(continuebutton).click();
    }
    public boolean loggedin(){
        return driver.findElement(loggedin).isDisplayed();
    }
    public void deleteaccount(){
        driver.findElement(deleteaccount).click();
    }
    public boolean AccountdeletedVisability(){
        return driver.findElement(accountdeletedVisability).isDisplayed();
    }



}
