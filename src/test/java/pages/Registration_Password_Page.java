package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
<<<<<<< HEAD

=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52

public class Registration_Password_Page {
    public By ssn = By.id("ssn");
    public By firstName = By.id("firstName");
    public By lastName = By.id("lastName");
<<<<<<< HEAD
    public By gender=By.xpath("//label[@for='male']");
=======
    public By gender = By.id("female");
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
    public By userName = By.id("username");
    public By job = By.id("job");
    public By cv = By.id("cv");
    public By email = By.id("email");
    public By password = By.id("password");
    public By passTracker = By.id("passwordStrength");
    public By submitButton = By.xpath("//button[@class='submit-btn']");


    public Registration_Password_Page enterSSN(String SSN) {
        Driver.getDriver().findElement(this.ssn).sendKeys(SSN);
        return this;
    }

    public Registration_Password_Page enterFirstName(String FirstName) {
        Driver.getDriver().findElement(this.firstName).sendKeys(FirstName);
        return this;
    }

    public Registration_Password_Page enterLastName(String LastName) {
        Driver.getDriver().findElement(this.lastName).sendKeys(LastName);
        return this;
    }

    public Registration_Password_Page clickGender() {
        Driver.getDriver().findElement(this.gender).click();
        return this;
    }

    public Registration_Password_Page enterUserName(String username) {
        Driver.getDriver().findElement(this.userName).sendKeys(username);
        return this;
    }

    public Registration_Password_Page enterEmail(String email) {
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }

    public Registration_Password_Page enterPass(String pass) {
        Driver.getDriver().findElement(this.password).sendKeys(pass);
        return this;
    }

<<<<<<< HEAD
//    public int passwordTrack() {
//        String value = Driver.getDriver().findElement(passTracker).getAttribute("value");
//        return Integer.parseInt(value);
//    }
=======
    public int passwordTrack() {
        String value = Driver.getDriver().findElement(passTracker).getAttribute("value");
        return Integer.parseInt(value);
    }
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52

    public Registration_Password_Page clicksubmit() {
        Driver.getDriver().findElement(this.submitButton).click();
        return this;
    }

    public boolean PasswordType() {
        String passType= Driver.getDriver().findElement(this.password).getAttribute("type");
        return passType.equals("password");
    }

    public boolean PasswordPlaceHolder() {
        String placeHolder= Driver.getDriver().findElement(password).getAttribute("placeholder");
         return "Enter your password".equals(placeHolder);
     }

    public Registration_Password_Page clear() {
       WebElement clearPass= Driver.getDriver().findElement(this.password);
        clearPass.sendKeys(Keys.chord(Keys.CONTROL, "a")); // select all
        clearPass.sendKeys(Keys.DELETE);
        return this;
    }

    public int passStrength() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2))
<<<<<<< HEAD
        .until(driver -> Driver.getDriver().findElement(this.passTracker).getAttribute("value") != null);
=======
                .until(driver -> Driver.getDriver().findElement(this.passTracker).getAttribute("value") != null);

>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
        String value = Driver.getDriver().findElement(passTracker).getAttribute("value");
        return Integer.parseInt(value);
    }

    public boolean validPassword(String pass) {
        boolean length = pass.length() >= 8;
        boolean upper = pass.chars().anyMatch(Character::isUpperCase);
        boolean lower = pass.chars().anyMatch(Character::isLowerCase);
        boolean digit = pass.chars().anyMatch(Character::isDigit);
        return length && upper && lower && digit;
    }
<<<<<<< HEAD
    public Registration_Password_Page Form(){
        enterSSN("123-45-4567");
        enterFirstName("John");
        enterLastName("Doe");
        clickGender();
        enterUserName("John_D");
        enterEmail("john@yahoo.com");
        return this;
    }
=======
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
}