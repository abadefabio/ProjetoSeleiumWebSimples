package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import suporte.UltilsFR;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginPage extends UltilsFR {

    WebDriver driver;
    String url = "https://automationexercise.com/signup";

    private By criarNome_field = By.name("name");
    private By criarEmail_fieldOLD = By.xpath("//*[@name=\"email\"][2]");
    private By campoCriarEmail = By.cssSelector("input[name=email][data-qa=signup-email]");
//    document.querySelector("input[name=email][data-qa=signup-email]")
    private By criarEmail_field = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]");
    private By btn_Signup = By.cssSelector("div.signup-form button");
//    private By btn_Signup = By.xpath("//button[contains(text(),'Signup')]");





    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    public void acessarTelaLogin() throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\fabade\\Documents\\qazando_seleniumCadastroUsuario\\geckodriver.exe");
        driver.get(url);
        esperarElementoEstarPresente(criarNome_field,20);
        //Thread.sleep(2000);
    }

    public void preencherCriarEmail() {
        //driver.findElement(criarEmail_field).sendKeys(getRandomEmail());
        escreverTexto(criarNome_field,"QAzando Name");
        escreverTexto(campoCriarEmail,getRandomEmail());
    }

    public void clicarBotaoSignup() throws InterruptedException {
        clicar(btn_Signup);
        Thread.sleep(2000);
    }
}
