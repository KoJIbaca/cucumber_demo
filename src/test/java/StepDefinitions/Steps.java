package StepDefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.open;


public class Steps {

    @Дано("пользователь находится на стартовой странице")
    public void start_page () {
        open("http://demo.guru99.com/v4");
        String current_url = WebDriverRunner.getWebDriver().getCurrentUrl();
        if(current_url == "http://demo.guru99.com/v4") {
            System.out.println("Стартовая страница открылась");
        }
        else {
            System.out.println("Стартовая страница не открылась");
        }
    }

    @Когда("пользователь вводит валидный логин и пароль")
    public void input_credentials() {
        WebDriverRunner.getWebDriver().findElement(By.name("uid")).sendKeys("username12");
        WebDriverRunner.getWebDriver().findElement(By.name("password")).sendKeys("password");
        System.out.println("Пользователь ввел валидные логин и пароль");
    }

    @Тогда("пользователь нажимает кнопку авторизации")
    public void click_login_btn() {
        WebDriverRunner.getWebDriver().findElement(By.name("btnLogin")).click();
        System.out.println("Пользователь нажал кнопку авторизации");
    }
}

