package sample02;

import org.testng.annotations.*;

import java.lang.reflect.Method;

public class MethodExample {
    @BeforeClass
    public void startDriver() {
        System.out.println("startDriver");
    }
    //очищаем логи. Можно передать Method в @BeforeMethod, например, для того, чтобы,
    //зная название метода, создать видеофайл с уникальным названием
    @BeforeMethod
    public void setUp() {
        System.out.println("clean logs");
    }

    @Test
    public void test1() {
        System.out.println("go to site1");
    }

    @Test
    public void test2() {
        System.out.println("go to site2");
    }

    @AfterMethod
    //логирование или запись видео в уникальный файл за счёт инъекции параметра Method
    public void tearDown(Method method) {
        System.out.println("save logs in unique file");
    }

    @AfterClass(alwaysRun = true)
    public void stopDriver() {
        System.out.println("stopDriver");
    }
}
