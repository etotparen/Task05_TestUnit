package ban_home;

import org.testng.Assert;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PenWritingTest {
    private int inkContainerValue;
    private String Word;
    private String expectedWord;

    @Test
    @Parameters({"inkContainerValue", "Word", "expectedWord"})
    public void test() {
        Pen pen = new Pen(inkContainerValue);
        Assert.assertEquals(pen.write(Word), expectedWord);
    }
}
