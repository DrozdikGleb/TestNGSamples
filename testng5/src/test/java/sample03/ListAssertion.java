package sample03;

import org.testng.asserts.Assertion;
import org.testng.asserts.IAssert;

import java.util.List;

// для создания своей проверки необходимо унаследоваться от Assertion
// проверки будут связаны с List
public class ListAssertion extends Assertion {

    // список, над которым будут проводиться разные проверки
    private final List mList;

    public ListAssertion(List list) {
        super();
        mList = list;
    }

    public void assertNotEmpty() {
        // делаем ассерт и передаем в метод ListAssert
        // и определяем абстрактный метод doAssert
        doAssert(new ListAssert("List is empty!") {
            @Override
            public void doAssert() {
                assertTrue(!mList.isEmpty(), getMessage());
            }
        });
    }

    public void assertSizeIs(final int size) {
        doAssert(new ListAssert("List size is " + mList.size() + ", not " + size) {
            @Override
            public void doAssert() {
                assertEquals(mList.size(), size);
            }
        });
    }

    public void assertNotNull() {
        doAssert(new ListAssert("List is null!") {
            @Override
            public void doAssert() {
                assertNotNull(mList);
            }
        });
    }

    // ..
    // и таких проверок может быть сколь угодно
    // ..

    // класс ListAssert, реализующий интерфейс IAssert
    // создали его для того, чтобы в методе doAssert
    // не нужно было постоянно определять строку и метод getMessage()
    private abstract class ListAssert implements IAssert {

        private final String mMessage;

        public ListAssert(String message) {
            mMessage = message;
        }

        public String getMessage() {
            return mMessage;
        }

        public abstract void doAssert();

        public Object getActual() {
            return null;
        }

        public Object getExpected() {
            return null;
        }
    }
}
