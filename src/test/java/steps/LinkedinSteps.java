package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.CreatePublication;
import pages.HomeLinkedin;
import pages.LoginPages;
import support.data.DataYaml;

public class LinkedinSteps {

    private LoginPages loginPage = new LoginPages();
    private HomeLinkedin homePage = new HomeLinkedin();
    private CreatePublication createPublication = new CreatePublication();

    @Dado("que estou na pagina de login")
    public void queEstouNaPaginaDeLogin() {
        loginPage.acessarAplicacao();
        Assert.assertTrue(loginPage.isPresent());
    }

    @Quando("efetuar o login com credencias validas")
    public void efetuarOLoginComCredenciasValidas() {
        loginPage.executarLogin(DataYaml.getMapYamlValues("UserLinkedin", "credenciais_validas"));
    }

    @Entao("vai ser apresentado a tela do menu principal")
    public void vaiSerApresentadoATelaDoMenuPrincipal() {
        Assert.assertTrue(homePage.isPresent());
    }

    @E("o usuario preenche o campo {string} com {string}")
    public void oUsuarioPreencheOCampoCom(String field, String value) {
        loginPage.fillField(field, value);
    }

    @Quando("o usuário clicar em entrar")
    public void oUsuárioClicarEmEntrar() {
        loginPage.clickEnter();
    }

    @Quando("usuario clica em começar publicação")
    public void usuarioClicaEmComeçarPublicação() {
        createPublication.clickCreatePublication();
    }


    @E("o usuario escrever um {string} com {string}")
    public void oUsuarioEscreverUmCom(String field, String value) {
        createPublication.fillField(field, value);
    }


    @E("clicar em publicar")
    public void clicarEmPublicar() throws InterruptedException {
        Thread.sleep(5000);
        createPublication.clickPublish();
    }

    @Entao("o post devera aparecer na tela do menu principal")
    public void oPostDeveraAparecerNaTelaDoMenuPrincipal() {
        Assert.assertTrue(createPublication.isPresent());
    }
}
