package TestTudo.Desafioqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Desafio QA")
public class IncluirClienteTest {

    @Test
    @DisplayName("Acessar como Admin")
    public void testDesafioqa() {
        // abrir chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // parte 1
        Login(navegador);

        // parte 2
        CadastroCliente(navegador);
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
    private void CadastroCliente(WebDriver navegador) {
        //parte 2
        //clicar em QA
        navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/a")).click();
        //clicar clientes
        navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[1]/a")).click();

        //clicar clientes-incluir
        navegador.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[1]/ul/li[1]")).click();
        //preencher campo nome
        navegador.findElement(By.id("nome")).sendKeys("cliente 102");
        //preencher campo cpf
        navegador.findElement(By.name("cpf")).sendKeys("10110110102");
        //clicar  campo ativo?
        navegador.findElement(By.id("status")).click();
        //clicar em ativo
        navegador.findElement(By.xpath("//*[@id=\"status\"]/option[1]")).click();
        //preencher campo saldo
        navegador.findElement(By.id("saldoCliente")).sendKeys("20000");
        //clicar salvar
        navegador.findElement(By.id("botaoSalvar")).click();
    }

}
