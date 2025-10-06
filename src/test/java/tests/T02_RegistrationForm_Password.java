package tests;

import com.aventstack.extentreports.Status;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Registration_Job_CV_Page;
import pages.Registration_Password_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReportManager;

import java.util.List;
@Listeners({AllureTestNg.class})

public class T02_RegistrationForm_Password {

        Registration_Password_Page password_page= new Registration_Password_Page();

        @Test(priority = 1)
        @Description("Password field is masked")
        void FirstTest(){
            //field is masked
            ExtentReportManager.createTest("field is masked");
            Driver.getDriver().get(ConfigReader.getProperty("form_url"));
            ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");
<<<<<<< HEAD
            password_page.Form();
            Assert.assertTrue(password_page.PasswordType(),"password is not masked");
            password_page.clicksubmit();
=======
            Assert.assertTrue(password_page.PasswordType(),"password is not masked");
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
            ExtentReportManager.log(Status.PASS,"password is successfully masked");
        }

        @Test(priority = 2)
        @Description("verify password field displays Enter your password as placeholder")
        void SecondTest(){
            //Enter your password as placeholder
            ExtentReportManager.createTest("Enter your password as placeholder");
            Driver.getDriver().get(ConfigReader.getProperty("form_url"));
            ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");
<<<<<<< HEAD
            password_page.Form();
            Assert.assertTrue(password_page.PasswordPlaceHolder(),"wrong placeholder");
            password_page.clicksubmit();
=======

            Assert.assertTrue(password_page.PasswordPlaceHolder(),"wrong placeholder");
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
            ExtentReportManager.log(Status.PASS,"placeholder is correct");
        }

        @Test(priority = 3)
        @Description(" verify a valid password")
        void ThirdTest(){
            // verify a valid password
            ExtentReportManager.createTest(" verify a valid password");
            Driver.getDriver().get(ConfigReader.getProperty("form_url"));
            ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");

            String password ="John12doe";
<<<<<<< HEAD
            password_page.Form();
            password_page.enterPass(password);
            password_page.clicksubmit();
=======
            password_page.enterPass(password);
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
            Assert.assertTrue(password_page.validPassword(password),"password is invalid");
            ExtentReportManager.log(Status.PASS," password is valid");
        }

        @Test(priority = 4)
        @Description("verify password strength bar is reset when password is cleared")
        void FourthTest() throws InterruptedException {
            //Job and CV side by side
            ExtentReportManager.createTest("password strength bar is reset when password is cleared");
            Driver.getDriver().get(ConfigReader.getProperty("form_url"));
            ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");

<<<<<<< HEAD
            password_page.Form();
=======
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
            String password ="John12doe*";
            password_page.enterPass(password);
            password_page.clear();
            Assert.assertEquals(password_page.passStrength(),0);
            ExtentReportManager.log(Status.PASS,"password strength bar is reset when password is cleared");
        }

        @Test(priority = 5)
        @Description("invalid password that missing a digit")
        void FifthTest(){
            //CV button is clickable and upload file successfully
            ExtentReportManager.createTest("invalid password missing a digit");
            Driver.getDriver().get(ConfigReader.getProperty("form_url"));
            ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");

            String invalidpassword ="JohnDoe";
<<<<<<< HEAD
            password_page.Form();
=======
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
            password_page.enterPass(invalidpassword);
            Assert.assertFalse(password_page.validPassword(invalidpassword),"password is invalid");
            ExtentReportManager.log(Status.PASS,"CV Button can be click");
        }

        @AfterClass
        void TearDown(){
            ExtentReportManager.flushReport();
            Driver.closeDriver();
        }
}
