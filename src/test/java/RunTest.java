import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunTest {

    String a = "привет", b = "привет";

    @Before
    public void beforeTest(){
        System.out.println("@Before annotation run");
    }
    @Test
    public void bodyTest(){
        System.out.println("@Test annotation run");

    }

    @After
    public void afterTest(){
        System.out.println("@After annotation run");

    }

}
