import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void isGreaterTest(){
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertTrue("Sayı 1 Sayı 2 den büyüktür" ,helloWorld.isGreater(4,3) );

    }
}
