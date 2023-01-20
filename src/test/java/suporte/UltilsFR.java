package suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;
import java.util.Random;

public class UltilsFR extends RunCucumberTest {

    public void esperarElementoEstarPresente(By elemento, int tempo){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void clicar(By propriedade) {
        driver.findElement(propriedade).click();
    }

    public void escreverTexto(By propriedade, String texto) {
        WebElement vTexto = driver.findElement(propriedade);
        vTexto.clear();
        vTexto.sendKeys(texto);
    }
    public WebElement find(By selector) {
//        WebElement test = driver.findElement(selector);
//        test.sendKeys();
        return driver.findElement(selector);
    }

    /**
     * Metodo para gerar email de forma a não repetir o mesmo.
     * @return
     */
    public String  getRandomEmail(){
        String email_init = "qazando_";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int minimo =1;
        int maximo = 99999999;
        int resultado = random.nextInt(maximo-minimo)+ minimo;

        return email_init + resultado + email_final;
    }

    /**
     * Metodo para gerar senha aleatoria
     * @return
     */
    public static String gerarSenha(){
        int qtdeMaximaCaracteres = 8;
        String[] caracteres = { "0", "1", "b", "2", "4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z"};

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();

    }
}
