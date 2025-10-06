package tests;


import com.aventstack.extentreports.Status;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Registration_Job_CV_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReportManager;

import java.util.List;

@Listeners({AllureTestNg.class})
public class T01_RegistrationForm_Job_CV {

    Registration_Job_CV_Page registrationPage= new Registration_Job_CV_Page();

    @Test(priority = 1)
    @Description("Job field displays Select a job as default placeholder")
    void FirstTest(){
         //placeHolder test
        ExtentReportManager.createTest("Job field displays Select a job as default placeholder");
        Driver.getDriver().get(ConfigReader.getProperty("form_url"));
        ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");
<<<<<<< HEAD
        //fill the form
        registrationPage.Form();
=======
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
        String text= registrationPage.FirstJob();
        Assert.assertEquals(text,"Select a job");
        ExtentReportManager.log(Status.PASS,"select a job appears as default");
    }

    @Test(priority = 2)
    @Description("job options are appear all")
    void SecondTest(){
        //all jobs are appears in dropdown
        ExtentReportManager.createTest(" job options are appear all");
        Driver.getDriver().get(ConfigReader.getProperty("form_url"));
        ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");
<<<<<<< HEAD
        //fill the form
        registrationPage.Form();
=======

>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
        List<String> select= registrationPage.selectJobOptions();
        int allOptions= select.size();
        Assert.assertEquals(allOptions,6);
        ExtentReportManager.log(Status.PASS,"All jobs are appear in dropdown menu");
    }

    @Test(priority = 3)
    @Description(" jobs can be select after click on it")
    void ThirdTest(){
        // select a job "Tester"
        ExtentReportManager.createTest(" jobs can be select after click on it");
        Driver.getDriver().get(ConfigReader.getProperty("form_url"));
        ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");
<<<<<<< HEAD
        //fill the form
        registrationPage.Form();
=======
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
        registrationPage.selectSpecificJob("Tester");
        Assert.assertEquals(registrationPage.FirstJob(),"Tester");
        ExtentReportManager.log(Status.PASS,"successfully selection of job Tester");
    }

    @Test(priority = 4)
    @Description(" Job and CV fields are displayed side-by-side")
    void FourthTest(){
        //Job and CV side by side
        ExtentReportManager.createTest("Job and CV fields are displayed side-by-side");
        Driver.getDriver().get(ConfigReader.getProperty("form_url"));
        ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");
<<<<<<< HEAD
        //fill the form
        registrationPage.Form();
        registrationPage.clicksubmit();
=======
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
        Assert.assertTrue(registrationPage.JobCVsideBySide(),"Job selection and CV button are side By side");
        ExtentReportManager.log(Status.PASS,"Job selection and CV button are side By side");
    }

    @Test(priority = 5)
    @Description("CV file button can be clickable")
    void FifthTest(){
        //CV button is clickable and upload file successfully
        ExtentReportManager.createTest("verify CV file button can be clickable");
        Driver.getDriver().get(ConfigReader.getProperty("form_url"));
        ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");
<<<<<<< HEAD
        //fill the form
        registrationPage.Form();
        registrationPage.clickCV();
        ExtentReportManager.log(Status.FAIL,"CV Button can be click");
=======
        Assert.assertTrue( registrationPage.clickCV());
        ExtentReportManager.log(Status.PASS,"CV Button can be click");
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
    }


    @Test(priority = 6)
    @Description("File name is appear")
    void SixthTest(){
        //File name is appear
        ExtentReportManager.createTest("verify CV file name is appear");
        Driver.getDriver().get(ConfigReader.getProperty("form_url"));
        ExtentReportManager.log(Status.INFO,"Navigated To Registration Page");
<<<<<<< HEAD
        //fill the form
        registrationPage.Form();
        String file="C:\\Users\\ASUS\\Documents\\Result_Form_Report.pdf";
        registrationPage.uploadCV(file);
        String fileName= registrationPage.fileName();
        registrationPage.clicksubmit();

=======

        String file="C:\\Users\\ASUS\\Documents\\Result_Form_Report.pdf";
        registrationPage.uploadCV(file);

        String fileName= registrationPage.fileName();
>>>>>>> 185f4d34170342740673f8efd1e2fc03838ffe52
        Assert.assertTrue(fileName.contains(".pdf"), "Uploaded file should be a PDF");
        ExtentReportManager.log(Status.PASS,"CV Button can be click and upload a file successfully");
    }


    @AfterClass
    void TearDown(){
        ExtentReportManager.flushReport();
        Driver.closeDriver();
    }
}
