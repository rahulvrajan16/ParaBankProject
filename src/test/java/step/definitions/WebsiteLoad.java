package step.definitions;

import common.Browser;
import common.WebSiteURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobjects.ParaBankUI;



import java.util.Arrays;
import java.util.List;
@Slf4j
public class WebsiteLoad {

        ParaBankUI p = new ParaBankUI();
//        Logger logger = LogManager.getLogger(WebsiteLoad.class);

        @Given("^The website is loaded$")
        public void the_website_is_loaded() {
                Browser.OpenChromeBrowser();
                log.info("Chrome browser opening...");
        }

        @When("^Navigate to the given URL$")
        public void navigate_to_the_given_url() throws InterruptedException {

                Browser.driver.navigate().to(WebSiteURL.PARA_BANK);
                Thread.sleep(10000);

//                TakesScreenshot scrShot = ((TakesScreenshot)Browser.driver );
//                File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
//                File dstFile = new File("C:/Users/rahul/Desktop/Screenshot");
//                FileUtils.copyFile(srcFile,dstFile);
        }

        @Then("^Display ParaBank website$")
        public void display_parabank_website(){
                //verify that the page title is correct
                String actualTitle = Browser.driver.getTitle();
                String expectedTitle = "ParaBank | Welcome | Online Banking";
                Assert.assertEquals(expectedTitle,actualTitle);


        }

        @Then("^verify the Caption is correct$")
        public void verify_the_caption_is_correct()  {
                String actualCaptionText= p.getCaptionEle().getText();
                String expectedCaptionText = "Experience the difference";
                Assert.assertEquals(actualCaptionText,expectedCaptionText);
        }


        @Then("^verify the Left Menus are displayed$")
        public void verify_the_left_menus_are_displayed(){
                List<WebElement> listofLeftMenus = p.getLeftMenuEle();
                int expectedSizeofElements = listofLeftMenus.size();
                int actualElements = 6;
                Assert.assertEquals(actualElements,expectedSizeofElements);
                System.out.println("expectedSizeofElements"+expectedSizeofElements);
                List<String> expectedLeftMenuItemsList = Arrays.asList("Solutions","About Us","Services","Products","Locations","Admin Page");
                for(WebElement checkLeftMenuEle: listofLeftMenus){
                        String actualLeftMenuValue = checkLeftMenuEle.getText();
                        Assert.assertTrue(expectedLeftMenuItemsList.contains(actualLeftMenuValue),actualLeftMenuValue.concat(" is found in the list"));
                }
        }
        @Then("^I check if the ATM services menus are available$")
        public void i_check_if_the_atm_services_menus_are_available()  {
                List<String> expectedATMMenuListValue = Arrays.asList("ATM Services","Withdraw Funds","Transfer Funds","Check Balances","Make Deposits");
                List<WebElement> checkATMMenuList = p.getATMMenuEle();
                Assert.assertEquals(expectedATMMenuListValue.size(),checkATMMenuList.size());

                for (WebElement atmMenuListValues :checkATMMenuList
                     ) {
                        String actualAtmMenuValues = atmMenuListValues.getText();
                        Assert.assertTrue(expectedATMMenuListValue.contains(actualAtmMenuValues),actualAtmMenuValues.concat("found the ATM menu values"));
                }
        }


        @Then("^I check if the Online service menus are available$")
        public void i_check_if_the_online_service_menus_are_available() {
                List<String>expectedOnlineServiceMenu =Arrays.asList("Bill pay","Account History","Transfer Funds");
                List<WebElement>listOfOnlineServiceMenu = p.getOnlineServiceMenu();
                for(WebElement onlineServiceEle:listOfOnlineServiceMenu){
                        String actualOnlineServiceMenu = onlineServiceEle.getText();
                        Assert.assertTrue(expectedOnlineServiceMenu.contains(actualOnlineServiceMenu));
                }
        }
        @Then("^I check if the footer panel menus are available$")
        public void i_check_if_the_footer_panel_menus_are_available() {
                List<String> expectedFooterPanelMenu = Arrays.asList("Home","About Us","Services","Products","Locations","Forum","Site Map","Contact Us");
                List<WebElement> listOfFooterPanelMenu = p.getFooterPanelMenu();
                for (WebElement  footerPanelEle: listOfFooterPanelMenu){
                        String actualFooterPanelMenu =footerPanelEle.getText();
                        Assert.assertTrue(expectedFooterPanelMenu.contains(actualFooterPanelMenu));
                }
        }
        @Then("^I verify the Latest News menu's are displayed$")
        public void i_verify_the_latest_news_menus_are_displayed()  {
               List<String> expectedLatestNewsMenus = Arrays.asList("8/20/2022","ParaBank Is Now Re-Opened","New! Online Bill Pay","New! Online Account Services");
               List<WebElement> listOfLatestMenu = p.getLatestMenu();
               for(WebElement latestMenuEle: listOfLatestMenu){
                       System.out.println(latestMenuEle.getText());
               }
        }

        @Then("^I will close the browsers$")
        public void i_will_close_the_browsers() throws Throwable {
                Browser.CloseAllBrowserWindows();
        }
}
