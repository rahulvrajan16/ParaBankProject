package step.definitions;

import common.Browser;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobjects.ParaBankUI;

import java.util.Arrays;
import java.util.List;

public class UIFunctionsStepDefinitions {

    ParaBankUI p = new ParaBankUI();
    @Then("^I select About Us$")
    public void i_select_about_us() {
        WebElement aboutUsMenu = p.getAboutUsLinkMenu();
        aboutUsMenu.click();
        String expectedAboutUsUrl = "https://parabank.parasoft.com/parabank/about.htm";
        String actualAboutUsUrl= Browser.driver.getCurrentUrl();
        Assert.assertTrue(actualAboutUsUrl.contains(expectedAboutUsUrl));

        WebElement aboutUsHeaderEle = p.getAboutUsHeader();
        String expectedHeader = aboutUsHeaderEle.getText();
        String actualHeader = "ParaSoft Demo Website";
        Assert.assertEquals(actualHeader,expectedHeader);

    }

    @Then("I select Services")
    public void iSelectServices() {
        Browser.driver.navigate().back();
        WebElement servicesMenu = p.getServicesMenu();
        servicesMenu.click();

        //Book Store services table rows count verification
        List<WebElement> allRowsofBookStoreServices = p.getBookStoreServicesRows();
        int expectedRows = 6;
        Assert.assertEquals(allRowsofBookStoreServices.size(),expectedRows);

        //Verification of first column headers using CSS selector
        List<String>actualBookStoreValues = Arrays.asList("Bookstore","Bookstore (Version 2.0)","Bookstore\n" +
                "(WS-Security Username Token)","Bookstore\n" +
                "(WS-Security Signature)","Bookstore\n" +
                "(WS-Security Encryption)","Bookstore\n" +
                "(WS-Security Signature and Encryption)");
        List<WebElement> actualHeader = p.getBookStoreElements();
        List<String> tdValues = p.getValueTdContents(actualHeader);
        System.out.println("TdValues"+tdValues);
        Assert.assertEquals(actualBookStoreValues,tdValues);
    }

    @Then("I select Products")
    public void i_select_products() {
//       WebElement products = p.getProductsMenu();
//       products.click();
//       String currentUrl = Browser.driver.getCurrentUrl();
//        System.out.println("URL: "+currentUrl);
        System.out.println("hello world");
        System.out.println("hello world");
    }
}
