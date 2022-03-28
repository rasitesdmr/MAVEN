import org.junit.Assert;
import org.junit.Test;

public class DenemeTest {
    @Test
    public void isGreaterTest() {
        Deneme deneme = new Deneme();
        Assert.assertTrue("Sayı 1 Sayı 2 den Büyüktür.", deneme.isGreater(4, 3));
    }
}
