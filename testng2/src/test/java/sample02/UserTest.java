package sample02;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// multiple_tests_suite.xml в теге test указан параметр user, который и приходит во все тесты
// пример параметризованного теста
// тестируем авторизацию пользователя и админа
public class UserTest {

    @Test
    @Parameters("user") // параметр, указанный в multiple_tests_suite.iml
    public void testLogin(String user) {
        System.out.println("UserTest.testLogin with user = " + user);
    }
}
