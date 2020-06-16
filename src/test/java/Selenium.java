import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

    private static WebDriver driver = new ChromeDriver();
    private WebDriverWait wait = new WebDriverWait(driver,100);


    @BeforeAll
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver.get("https://automacaocombatista.herokuapp.com/users/new\n");
        driver.findElement(By.xpath("//a[text()='Começar Automaçâo Web']")).click();
        driver.manage().window().fullscreen();
    }

    @Test
    public void criarUsuario(){

        driver.findElement(By.xpath("//input[@id = 'user_name']")).sendKeys("Henrique");
        driver.findElement(By.xpath("//input[@id = 'user_lastname']")).sendKeys("Oliveira Silva");
        driver.findElement(By.xpath("//input[@id = 'user_email']")).sendKeys("hiky_silva@hotmail.com");
        driver.findElement(By.xpath("//input[@id = 'user_address']")).sendKeys("Rua João Teixeira Lacerda");
        driver.findElement(By.xpath("//input[@id = 'user_university']")).sendKeys("Harvard");
        driver.findElement(By.xpath("//input[@id = 'user_profile']")).sendKeys("Analista de Qualidade");
        driver.findElement(By.xpath("//input[@id = 'user_gender']")).sendKeys("Masculino");
        driver.findElement(By.xpath("//input[@id = 'user_age']")).sendKeys("18");
        driver.findElement(By.xpath("//div[@class = 'actions btn waves-effect green']")).click();

        String mensagem = driver.findElement(By.xpath("//p[@id = 'notice']")).getText();

    Assertions.assertEquals("Usuário Criado com sucesso", mensagem);

    }

    @Test
    public void radioCheckBox(){
        driver.findElement(By.xpath("//a[text() = 'Busca de elementos']")).click();
        WebElement Link = driver.findElement(By.xpath("//a[text() = 'Radio e Checkbox']"));
        wait.until(ExpectedConditions.visibilityOf(Link));
        Link.click();



    }

    @Test
    public static void fechaBrowser(){
        driver.quit();
    }
}
