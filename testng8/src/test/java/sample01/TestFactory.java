package sample01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestFactory {

    private String run;
    public TestFactory(String run) {
        this.run = run;
    }
    //в одном классе может быть не больше одной фабрики
    @Factory
    public Object[] tryFactory() {
        Object[] tests = new Object[3];
        for (int i = 0; i < 3 ; i++) {
            //создаём три теста с одинаковым поведением, но передаём в конструктор разные данные
            tests[i] = new TestFactory("run " + i);
        }
        return tests;
    }

    @BeforeClass
    public void setUp() {
        System.out.println("setUp " + run);
    }

    @Test
    public void test1() {
        System.out.println("test1 "  + run);
    }

    @Test
    public void test2() {
        System.out.println("test2 " + run);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("tearDown " + run);
    }
}
