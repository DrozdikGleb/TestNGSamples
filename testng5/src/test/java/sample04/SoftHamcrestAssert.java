package sample04;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

// у Hamcrest нет мягких проверок, поэтому приходится создавать свою
public class SoftHamcrestAssert extends SoftAssert {

    public <T> void assertThat(final String message, final T actual, final Matcher<? super T> matcher) {
        doAssert(new IAssert() {
            public String getMessage() {
                return message;
            }

            public void doAssert() {
                MatcherAssert.assertThat(actual, matcher);
            }

            public Object getActual() {
                return actual;
            }

            public Object getExpected() {
                return null;
            }
        });
    }
}
