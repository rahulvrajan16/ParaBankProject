package pageobjects;

import common.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ParaBankUI {

    final private By captionEleLocator = By.xpath("//*[@id=\"topPanel\"]/p");
    final private By leftMenuEleLocator = By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li");
    final private By atmMenuEleLocator =By.xpath("//*[@id='rightPanel']/ul[1]/li");
    final private By onlineServiceLocator = By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li");
    final private By footerPanelMenuLocator = By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li");
    final private By latestMenuLocator = By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li");

    public WebElement getCaptionEle(){
        WebElement captionEle = Browser.driver.findElement(this.captionEleLocator);
        return captionEle;
    }

    public List<WebElement> getLeftMenuEle(){
        List<WebElement> leftMenuElements = Browser.driver.findElements(this.leftMenuEleLocator);
        return leftMenuElements;
    }

    public List<WebElement> getATMMenuEle() {
        List<WebElement> ATMMenuElements = Browser.driver.findElements(this.atmMenuEleLocator);
        return ATMMenuElements;
    }

    public List<WebElement> getOnlineServiceMenu() {
        List<WebElement>onlineServiceMenuElements = Browser.driver.findElements(this.onlineServiceLocator);
        return onlineServiceMenuElements;
    }

    public List<WebElement> getFooterPanelMenu() {
        List<WebElement>footerPanelElements = Browser.driver.findElements(this.footerPanelMenuLocator);
        return footerPanelElements;
    }

    public List<WebElement> getLatestMenu() {
        List<WebElement>latestMenuElements = Browser.driver.findElements(this.latestMenuLocator);
        return latestMenuElements;
    }
}
