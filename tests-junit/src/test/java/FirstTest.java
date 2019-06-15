import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {
    private static final Logger logger = LogManager.getLogger(FirstTest.class);


    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", ".//Users/avkorolev/IdeaProjects/lesson2/src/main/java/resources/log4j2.xml");


        logger.info("INFO");
        logger.debug("DEBUG");
        logger.error("ERROR");
        logger.fatal("FATAL");
        logger.warn("WARN");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://otus.ru");
    }
}