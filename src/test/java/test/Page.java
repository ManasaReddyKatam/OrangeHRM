package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page {
    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement Username;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement Password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Login;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][1]")
    public WebElement ClickOnAdmin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")
    public WebElement ClickOnNationalities;



    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    public WebElement AddNationalities;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    public WebElement NationalitiesName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElement SaveNationalitiy;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifySaveNationalitiy;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElement SaveNationalities;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]/i")
    public WebElement EditNationalities;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    public WebElement EditNationalitiesName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElement SaveEditNationalities;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement  VerifyEditNationalities;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[1]/div/div[1]/div/label/span/i")
    public WebElement  SelectDeleteNationality;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button")
    public WebElement  ClickOnDelete;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    public WebElement  ClickOnDeleteYes;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement  VerifyDelete;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/span")
    public WebElement  VerifyREqFields;




}