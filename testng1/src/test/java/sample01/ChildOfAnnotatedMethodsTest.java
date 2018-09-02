package sample01;

import org.testng.annotations.Test;

// класс-наследник также выполнит все тесты базового класса
// (которые сам базовый класс способен выполнить)
public class ChildOfAnnotatedMethodsTest extends AnnotatedMethodsTest {

    @Test
    public void childTest() {
        System.out.println("childTest");
    }
}
