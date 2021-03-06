package ru.GB.tests;

import org.testng.annotations.Test;
import ru.GB.base.BaseTest;

public class MyFirstTest extends BaseTest {

    @Test
    public void checkEmptyEmail() throws Exception{
        // Устанавливаем capabilities.
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Pixel_4_API_30_233");
//        capabilities.setCapability("platformVersion", "11");
//        capabilities.setCapability("udid", "emulator-5554");
//        capabilities.setCapability("automationName", "UiAutomator2");
////      Проверьте актуальность пути до приложения на своём компьютере.
//        capabilities.setCapability("app", "/Users/robot/Downloads/Android-NativeDemoApp-0.2.1.apk");
//
//        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        //      Нажимаем Login в меню
//        MobileElement loginMenuButton = (MobileElement) driver.findElementByAccessibilityId("Login");
//        loginMenuButton.click();


//        Thread.sleep(2000);
////      Нажимаем Login на странице логин/пароль.
//        MobileElement loginButton = (MobileElement) driver.findElementByAccessibilityId("button-LOGIN");
//        loginButton.click();
//        Thread.sleep(2000);
////      Проверяем текст ошибки.
//        MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
//        Assert.assertEquals(errorText.getText(), "Please enter a valid email address");

        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText("Please enter a valid email address");

    }


}


