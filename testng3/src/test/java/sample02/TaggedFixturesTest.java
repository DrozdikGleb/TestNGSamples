package sample02;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaggedFixturesTest {

    @BeforeMethod(groups = {"G12_1"})
    public void setUpG1() {
        System.out.println("setUpG12_1");
    }

    @BeforeMethod(groups = {"G12_2"})
    public void setUpG2() {
        System.out.println("setUpG12_2");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        System.out.println("tearDown");
    }

    @Test(groups = {"G12_1"})
    public void test1() {
        System.out.println("test1");
    }
    //запустится только эта группа, поскольку мы указали только её в файле конфигурации
    @Test(groups = {"G12_2"})
    public void test2() {
        System.out.println("test2");
    }
}
