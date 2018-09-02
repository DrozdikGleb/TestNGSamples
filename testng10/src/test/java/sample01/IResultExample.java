package sample01;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//Например, мы хотим делать скриншот после неуспешного теста
public class IResultExample {
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
        Assert.assertTrue(false);
    }

    @AfterMethod
    //смотрим успешен тест или нет и делаем скриншот ( если не успешен )
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            System.out.println("Taking screenshot after failure" + result.getName());
        }
    }
}
