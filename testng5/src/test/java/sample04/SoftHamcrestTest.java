package sample04;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SoftHamcrestTest {

    @Test
    public void testHardAssert() {
        // assertThat из библиотеки Hamcrest
        // is() тоже из библиотеки Hamcrest
        assertThat("Three", 2 * 2, is(3));
        assertThat("Five", 2 * 2, is(5));
    }

    // у Hamcrest нет мягких проверок, поэтому приходится создавать свою
    @Test
    public void testSoftAssert() {
        SoftHamcrestAssert h = new SoftHamcrestAssert();
        h.assertThat("Three", 2 * 2, is(3));
        h.assertThat("Five", 2 * 2, is(5));
        h.assertAll();
    }
}
