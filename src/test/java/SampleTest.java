import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void setup(){

        //System.out.println("Testing Jerry");
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.adidas.co.uk/");
//        WebElement username = driver.findElement(By.id("user_email_Login"));
//        WebElement password = driver.findElement(By.id("user_password"));
//        WebElement login = driver.findElement(By.name("commit"));
//        username.sendKeys("abc@gmail.com");
//        password.sendKeys("your_password");
//        login.click();
//        String actualUrl ="https://live.browserstack.com/dashboard";
//        String expectedUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl,actualUrl);




    }
}



