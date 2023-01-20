package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage login = new LoginPage(driver);

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() throws InterruptedException {
        login.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro de usuario$")
    public void acesso_o_cadastro_de_usuario() throws InterruptedException {
        login.preencherCriarEmail();
        login.clicarBotaoSignup();
    }
}
