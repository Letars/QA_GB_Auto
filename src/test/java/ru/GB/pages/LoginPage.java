package ru.GB.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.GB.locators.LoginPageLocators;

public class LoginPage {
    // Метод позволяет работать с локаторами для нужной нам страницы.
    private LoginPageLocators locator() {
        return new LoginPageLocators();
    }

    @Step("Кликаем по кнопке 'логин' в форме")
    public LoginPage clickLoginButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }


    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        $(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

}
