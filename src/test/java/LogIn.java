import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class LogIn {
    @Test
    public void logInWithIncorrectData(){
        WebDriverManager.chromedriver().setup();
        Selenide.open("https://tbconline.ge/tbcrd/login");
        sleep(5000);
    }
}
