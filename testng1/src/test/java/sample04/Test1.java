package sample04;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// тестовый класс наследуется от базового класса,
// у которого есть методы, помеченные аннотациями фикстур,
// то, в первую очередь, выполнятся фикстуры родительского класса @Before
// и в последнюю очередь фикстуры родительского класса @After
@Test
public class Test1 extends TestBase {

    @BeforeMethod
    public void setUp() {
        System.out.println("setUp");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tearDown");
    }

    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }
}
