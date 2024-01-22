package TestTudo.Desafioqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Desafio QA")
public class IncluirTransacaoTest {

    @Test
    @DisplayName("Acessar como Admin")
    public void testDesafioqa() {
        // abrir chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // parte 1
        Login(navegador);

        // parte 2
        RealizarTransacao(navegador);
    }


    private void Login(WebDriver navegador) {
        // abrir site
        navegador.get("http://54.166.20.145:9080/desafioqa");
        // preencher username="admin"
        navegador.findElement(By.name("username")).sendKeys("admin");
        // preencher password="admin"
        navegador.findElement(By.name("password")).sendKeys("admin");
        // clicar sign in
        navegador.findElement(By.xpath("//*[@id=\"login-form\"]/footer/button")).click();
    }
    private void RealizarTransacao(WebDriver navegador) {


        // parte
        // clicar em QA
        navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/a")).click();
        // clicar transacoes
        navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[2]/a")).click();
        // clicar incluir
        navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
        // clicar em selecione cliente
        navegador.findElement(By.id("cliente")).click();
        // clicar em cliente 2
        navegador.findElement(By.xpath("//*[@id=\"cliente\"]/option[2]")).click();
        // inserir valor
        navegador.findElement(By.id("valorTransacao")).sendKeys("200");
        // clicar salvar
        navegador.findElement(By.id("botaoSalvar")).click();
    }
}
