package sample01;

import org.testng.annotations.Test;

public class AnnotatedMethodsTest {

    // Все методы, помеченные аннотацией @Test, TestNG выполнит
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    // TestNG не выполнит этот метод, так как он не помечен аннотацией @Test
    public void notATest() {
        System.out.println("notATest");
    }

    // приватные методы тоже будут запущены
    @Test
    private void privateTest() {
        System.out.println("privateTest");
    }

    // тест не выполнится, так как аннотация с аргументом enabled = false
    // enabled = false обычно используется для временного отключения теств
    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("disabledTest");
    }
}
