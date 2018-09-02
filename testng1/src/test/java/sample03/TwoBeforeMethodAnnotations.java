package sample03;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// если укажем две и более одинаковых аннотаций для фикстур,
// то порядок выполнения будет неопределен (на самом деле - по алфавиту, но полагаться на это не нужно)
@Test
public class TwoBeforeMethodAnnotations {

    @BeforeMethod
    public void setUp1() {
        System.out.println("setUp1");
    }

    @BeforeMethod
    public void setUp2() {
        System.out.println("setUp2");
    }

    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }
}
