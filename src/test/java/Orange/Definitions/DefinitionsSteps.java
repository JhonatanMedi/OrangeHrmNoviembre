package Orange.Definitions;

import Orange.Pages.LoginPage;
import Orange.Pages.PimPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Orange.Steps.Conexion;
import io.cucumber.java.en.Given;

import java.sql.SQLException;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();

    //llamado de clase
    private LoginPage loginPage = new LoginPage(driver);

    private PimPage pimPage = new PimPage(driver);

    @Given("^abrir el navegador$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();

    }

    @When("^el usuario diligenica usuario (.*) diligencia password (.*)$")
    public void llenarLogin(String userName, String password) throws SQLException {
        this.loginPage = new LoginPage(driver);
        this.loginPage.llenarLogin(userName, password);
    }

    @When("^el usuario ingresa add employee diligencia el formulario (.*) (.*) (.*)$")
    public void agregarUsuario(String firtsName, String middle, String lastName) {
        this.pimPage = new PimPage(driver);
        this.pimPage.llegarAddEmployee();
        this.pimPage.agregarUsuario(firtsName, middle, lastName);
    }


}