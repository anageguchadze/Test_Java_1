import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class LogInTest {
    @Test
    public void logInWithIncorrectData(){
        WebDriverManager.chromedriver().setup();
        Selenide.open("https://tbconline.ge/tbcrd/login");


        sleep(5000);
    }
}
