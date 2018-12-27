import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RunTest {

    String a = "Hello", b = "Hello";

    @Before
    public void beforeTest(){
        System.out.println("@Before annotation run");
    }
    @Test
    public void bodyTest(){
        System.out.println("@Test_1 annotation run");
        Assert.assertEquals(a,b);
        System.out.println("String 'a' equals 'b'");

    }
    @Test
    public void failureTest(){
        System.out.println("@Test_2 annotation run");
            Assert.assertNotEquals(a,b);
    }

    @After
    public void afterTest(){
        System.out.println("@After annotation run");

    }

}
