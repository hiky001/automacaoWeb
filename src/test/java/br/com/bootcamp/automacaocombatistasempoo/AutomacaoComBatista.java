package br.com.bootcamp.automacaocombatistasempoo;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class AutomacaoComBatista {
//
//    private static WebDriver driver;
//    static WebDriverWait wait;
//
//    @BeforeAll
//    public static void setup() {
//        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, 90);
//        driver.manage().window().maximize();
//
//    }
//
//    @Test
//    public void criarUsuario() {
//        driver.get("https://automacaocombatista.herokuapp.com/users/new\n");
//        driver.findElement(By.xpath("//input[@id = 'user_name']")).sendKeys("Henrique");
//        driver.findElement(By.xpath("//input[@id = 'user_lastname']")).sendKeys("Oliveira Silva");
//        driver.findElement(By.xpath("//input[@id = 'user_email']")).sendKeys("hiky_silva@hotmail.com");
//        driver.findElement(By.xpath("//input[@id = 'user_address']")).sendKeys("Rua João Teixeira Lacerda");
//        driver.findElement(By.xpath("//input[@id = 'user_university']")).sendKeys("Harvard");
//        driver.findElement(By.xpath("//input[@id = 'user_profile']")).sendKeys("Analista de Qualidade");
//        driver.findElement(By.xpath("//input[@id = 'user_gender']")).sendKeys("Masculino");
//        driver.findElement(By.xpath("//input[@id = 'user_age']")).sendKeys("18");
//        driver.findElement(By.xpath("//div[@class = 'actions btn waves-effect green']")).click();
//
//        String mensagem = driver.findElement(By.xpath("//p[@id = 'notice']")).getText();
//
//        Assertions.assertEquals("Usuário Criado com sucesso", mensagem);
//
//    }
//
//    @Test
//    public void radioCheckBox() {
//        driver.get("https://automacaocombatista.herokuapp.com\n");
//
//        clicarElemento("//a[text()='Começar Automação Web']");
//        clicarElemento("//a [text() = 'Busca de elementos']");
//        clicarElemento("//a[text() = 'Radio e Checkbox']");
//
//        clicarElemento("//label [@for = 'red']");
//        clicarElemento("//label [@for = 'blue']");
//        clicarElemento("//label [@for = 'yellow']");
//        clicarElemento("//label [@for = 'green']");
//        clicarElemento("//label [@for = 'purple']");
//        clicarElemento("//label [@for = 'grey']");
//        clicarElemento("//label [@for = 'black']");
//        clicarElemento("//label [@for = 'white']");
//
//    }
//
//    @Test
//    public void select() {
//
//        driver.findElement(By.xpath("//a[text()='Busca de elementos']")).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dropdown e Select']")));
//
//        driver.findElement(By.xpath("//a[text()='Dropdown e Select")).click();
//
//        driver.findElement(By.xpath("//label[text()='Desenho Favorito']/preceding-sibling::div[@class='select-wrapper']")).click();
//        driver.findElement(By.xpath("//span[text()='Dragon Ball']")).click();
//
//        driver.findElement(By.xpath("//span[text()='Ronaldinho Gaucho']/ancestor::ul/preceding-sibling::input")).click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Ronaldinho Gaucho']")));
//        driver.findElement(By.xpath("//span[text()='Ronaldinho Gaucho']")).click();
//
//        WebElement ListaSelecao = driver.findElement(By.xpath("//select[@id='dropdown']"));
//        Select ListaDesenhoFavorito = new Select(ListaSelecao);
//
//        ListaDesenhoFavorito.selectByIndex(1);
//        ListaDesenhoFavorito.selectByValue("3");
//        ListaDesenhoFavorito.selectByVisibleText("Internet Explorer");
//
//    }
//
//    public void clicarElemento(String xpath) {
//        WebElement element = driver.findElement(By.xpath(xpath));
//        wait.until(ExpectedConditions.visibilityOf(element));
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//        element.click();
//    }
//
//    @AfterAll
//    public static void fechaBrowser() {
//        driver.quit();
//    }
//}
