package sample02;

import org.testng.annotations.Test;

public class HomePageTest extends BrowserOpenerTest {
    //условно сделаем какую-ту проверку (например, корректное открытие домашней страницы)
    @Test
    public void openHomePage() {
        System.out.println("open home page");
    }
}
