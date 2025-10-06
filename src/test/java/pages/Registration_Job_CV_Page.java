package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Registration_Job_CV_Page {
    public By ssn= By.id("ssn");
    public By firstName= By.id("firstName");
    public By lastName= By.id("lastName");
    public By gender=By.xpath("//label[@for='male']");
    public By userName=By.id("username");
    public By job=By.id("job");
    public By cv=By.id("cv");
    public By email=By.id("email");
    public By password=By.id("password");
    public By passTracker= By.id("passwordStrength");
    public By submitButton=By.xpath("//button[@class='submit-btn']");


    public Registration_Job_CV_Page enterSSN(String SSN){
        Driver.getDriver().findElement(this.ssn).sendKeys(SSN);
        return this;
    }
    public Registration_Job_CV_Page enterFirstName (String FirstName){
        Driver.getDriver().findElement(this.firstName).sendKeys(FirstName);
        return this;
    }
    public Registration_Job_CV_Page enterLastName (String LastName){
        Driver.getDriver().findElement(this.lastName).sendKeys(LastName);
        return this;
    }
    public Registration_Job_CV_Page clickGender (){
        Driver.getDriver().findElement(this.gender).click();
        return this;
    }
    public Registration_Job_CV_Page enterUserName (String username){
        Driver.getDriver().findElement(this.userName).sendKeys(username);
        return this;
    }

    public Registration_Job_CV_Page enterEmail(String email){
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }

    public Registration_Job_CV_Page enterPass(String pass){
        Driver.getDriver().findElement(this.password).sendKeys(pass);
        return this;
    }

//    public int passwordTrack(){
//      String value=Driver.getDriver().findElement(passTracker).getAttribute("value");
//     return Integer.parseInt(value);
//    }
    public int passwordTrack(){
      String value=Driver.getDriver().findElement(passTracker).getAttribute("value");
     return Integer.parseInt(value);
    }

    public Registration_Job_CV_Page clicksubmit(){
        Driver.getDriver().findElement(this.submitButton).click();
        return this;
    }


    public List<String> selectJobOptions(){
        WebElement allJobs= Driver.getDriver().findElement(this.job);
        allJobs.click();
        Select select=new Select(allJobs);
        List<WebElement> JobOptions= select.getOptions();
        List<String> jobNames= new ArrayList<>();
        for(WebElement option:JobOptions){
            jobNames.add(option.getText());
        }
        return  jobNames;
    }

    public Registration_Job_CV_Page selectSpecificJob(String Jobs){
        WebElement specificJob= Driver.getDriver().findElement(this.job);
        Select select=new Select(specificJob);
        select.selectByVisibleText(Jobs);
        return this;
    }

    public String FirstJob(){
        Select select=new Select( Driver.getDriver().findElement(this.job));
        return  select.getFirstSelectedOption().getText();
    }

    public void clickCV(){
        WebElement button=Driver.getDriver().findElement(this.cv);
        button.click();
    }

//    public boolean clickCV(){
//        WebElement button=Driver.getDriver().findElement(this.cv);
//        return button.isEnabled()&&button.isDisplayed();
//    }

    public void uploadCV(String file){
        WebElement button=Driver.getDriver().findElement(this.cv);
        button.sendKeys(file);

    }
    public String fileName(){
        WebElement button=Driver.getDriver().findElement(this.cv);
        return button.getAttribute("value");
    }

    public boolean JobCVsideBySide(){
        WebElement job= Driver.getDriver().findElement(this.job);
        WebElement cv = Driver.getDriver().findElement(this.cv);
        return cv.getLocation().getX()>job.getLocation().getX();
    }

    public Registration_Job_CV_Page Form(){
        enterSSN("123-45-4567");
        enterFirstName("John");
        enterLastName("Doe");
        clickGender();
        enterUserName("John_D");
        enterEmail("john@yahoo.com");
        enterPass("johnDo12");
        return this;
    }

}
