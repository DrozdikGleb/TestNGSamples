package sample01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParametrizedTests {

    @Test(dataProvider = "users")
    public void test1(String user, String password) throws InterruptedException {
        System.out.println(user + " " + password);
        Thread.sleep(1000);
    }

    @DataProvider(parallel = true)
    public Iterator<Object[]> users() {
        List<Object[]> data = new ArrayList<Object[]>();
        for (int i = 0; i < 10; i++) {
            data.add(new Object[]{"user" + i, "password" + i});
        }
        return data.iterator();
    }
}
