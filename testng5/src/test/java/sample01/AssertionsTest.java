package sample01;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

// по факту все три проверки работают одинаково
// разница лишь в содержимом логов
public class AssertionsTest {

    @Test
    public void testAssertKeyword() {
        System.out.println("testAssertKeyword");
        assert 2 * 2 == 5;
    }

    // в JUnit принято писать сначала ожидаемый результат,
    // а потом - фактический
    @Test(priority = 1)
    public void testAssertJUnit() {
        System.out.println("testAssertJUnit");
        AssertJUnit.assertEquals(5, 2 * 2);
    }

    // в TestNG - наоборот
    @Test(priority = 2)
    public void testAssertTestNG() {
        System.out.println("testAssertTestNG");
        Assert.assertEquals(2 * 2, 5);
    }
}
