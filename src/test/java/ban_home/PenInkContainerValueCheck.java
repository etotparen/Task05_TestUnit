package ban_home;

import org.testng.Assert;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class PenInkContainerValueCheck {
    private int inkContainerValue;

    @Test
    @Parameters("inkContainerValue")
    public void test() {
        Pen pen = new Pen(inkContainerValue);
        Assert.assertFalse(pen.isWork());
    }
}
