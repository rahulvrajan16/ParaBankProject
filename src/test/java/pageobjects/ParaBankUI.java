package pageobjects;

import common.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ParaBankUI {

    final private By captionEleLocator = By.xpath("//*[@id=\"topPanel\"]/p");
    final private By leftMenuEleLocator = By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li");
    final private By atmMenuEleLocator =By.xpath("//*[@id='rightPanel']/ul[1]/li");
    final private By onlineServiceLocator = By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li");
    final private By footerPanelMenuLocator = By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li");
    final private By latestMenuLocator = By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li");
    private By aboutUsLinkMenuLocator = By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a");
    private By aboutUsHeaderLocator = By.xpath("//*[@id=\"rightPanel\"]/h1");
    private By servicesMenuLocator = By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a");
    private By booksStoreServicesRowLocator = By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr");
    private By bookStoreTdLocator = By.cssSelector("#rightPanel > table:nth-child(6) >tbody >tr >td:nth-child(1)");
    private By getProductsLink = By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]");

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

    public WebElement getAboutUsLinkMenu(){
        WebElement aboutUsEle = Browser.driver.findElement(this.aboutUsLinkMenuLocator);
        return aboutUsEle;
    }

    public WebElement getAboutUsHeader() {
        WebElement aboutUsHeaderEle = Browser.driver.findElement(this.aboutUsHeaderLocator);
        return aboutUsHeaderEle;
    }

    public WebElement getServicesMenu() {
        WebElement servicesEle = Browser.driver.findElement(this.servicesMenuLocator);
        return servicesEle;
    }

    public List<WebElement> getBookStoreServicesRows() {
        List<WebElement> allRowElements = Browser.driver.findElements(this.booksStoreServicesRowLocator);
        return allRowElements;
    }

    public List<WebElement> getBookStoreElements() {
        List<WebElement> allTdElements = Browser.driver.findElements(this.bookStoreTdLocator);
        return allTdElements;
    }

    public List<String> getValueTdContents(List<WebElement> actualHeader) {
        List<String> tdContentList = new ArrayList<String>();
        for (WebElement td:actualHeader) {
            String cellValue = td.getText();
            tdContentList.add(cellValue);
        }
        return tdContentList;
    }

    public WebElement getProductsMenu() {
        WebElement productsLink = Browser.driver.findElement(this.getProductsLink);
        return productsLink;
    }
}
