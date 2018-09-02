package sample07;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

@Test
public class SuiteFixture {

    // поля родительского класса, которые используются в потомках,
    // обязательно нужно определять с модификатором static,
    // так как TestNG выполняет методы, помеченные @[Before|After][Test|Suite],
    // в одном из потомков. Следовательно, если поле не будет static (общим для всех классов),
    // то в одном из классов, при обращении к полю, вылетит NullPointerException
    protected static int sField;

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("setUpSuite");
        sField = 100;
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("tearDownSuite");
        sField = 0;
    }
}
