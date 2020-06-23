import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

    private static WebDriver driver;
    static WebDriverWait wait;

    @BeforeAll
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait= new WebDriverWait(driver,90);
    }

    @Test
    public void criarUsuario(){
        driver.get("https://automacaocombatista.herokuapp.com/users/new\n");
        driver.manage().window().fullscreen();
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
        driver.get("https://automacaocombatista.herokuapp.com\n");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//a[text()='Começar Automação Web']")).click();
        WebElement Link = driver.findElement(By.xpath("//a[text() = 'Radio e Checkbox']"));
        wait.until(ExpectedConditions.visibilityOf(Link));
        Link.click();

        driver.findElement(By.xpath("//label [@for = 'red']")).click();
        driver.findElement(By.xpath("//label [@for = 'blue']")).click();
        driver.findElement(By.xpath("//label [@for = 'yellow']")).click();
        driver.findElement(By.xpath("//label [@for = 'green']")).click();
        driver.findElement(By.xpath("//label [@for = 'purple']")).click();
        driver.findElement(By.xpath("//label [@for = 'grey']")).click();
        driver.findElement(By.xpath("//label [@for = 'black']")).click();
        driver.findElement(By.xpath("//label [@for = 'white']")).click();

    }

    @Test
    public void select(){

        driver.findElement(By.xpath("//a[text()='Busca de elementos']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dropdown e Select']")));

        driver.findElement(By.xpath("//a[text()='Dropdown e Select")).click();

        driver.findElement(By.xpath("//label[text()='Desenho Favorito']/preceding-sibling::div[@class='select-wrapper']")).click();
        driver.findElement(By.xpath("//span[text()='Dragon Ball']")).click();

        driver.findElement(By.xpath("//span[text()='Ronaldinho Gaucho']/ancestor::ul/preceding-sibling::input")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Ronaldinho Gaucho']")));
        driver.findElement(By.xpath("//span[text()='Ronaldinho Gaucho']")).click();

        WebElement ListaSelecao = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select ListaDesenhoFavorito = new Select(ListaSelecao);

        ListaDesenhoFavorito.selectByIndex(1);
        ListaDesenhoFavorito.selectByValue("3");
        ListaDesenhoFavorito.selectByVisibleText("Internet Explorer");

    }

    @AfterAll
    public static void fechaBrowser(){
        driver.quit();
    }
}
