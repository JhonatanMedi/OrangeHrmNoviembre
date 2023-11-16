package Orange.Pages;

import Orange.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class PimPage {

    private ButtonPages buttonPages;

    //hola soy hu003
    @FindBy(how = How.XPATH, using = "//input[@name = 'firstName']")
    private WebElement txtFirstName;

    @FindBy(how = How.NAME, using = "middleName")
    private WebElement txtMiddleName;

    @FindBy(how = How.XPATH, using = "//input[@name = 'lastName']")
    private WebElement txtLastName;

    public PimPage(WebDriver driver) {
        this.buttonPages = new ButtonPages(driver);
        PageFactory.initElements(driver, this);
    }

    public void llegarAddEmployee() {
        buttonPages.btnPim();
        buttonPages.btnAdd();
    }

    public void agregarUsuario(String firstName, String middle, String lastName) {
        txtFirstName.sendKeys(firstName);
        txtMiddleName.sendKeys(middle);
        txtLastName.sendKeys(lastName);
        buttonPages.btnSave();
    }

}
