package ban_home;
import org.testng.Assert;
import org.testng.annotations.*;



public class PenColorTest {

    private int inkContainerValue;
    private double sizeLetter;
    private String color;

    @Test
    @Parameters({"inkContainerValue", "sizeLetter", "color"})
    public void test() {
        Pen pen = new Pen(inkContainerValue, sizeLetter, color);
        Assert.assertEquals(pen.getColor(), color);
    }
}
