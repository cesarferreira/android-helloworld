package github.cesarferreira.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals("Addition is correct",
                4, 2 + 2);
    }
    @Test
    public void addition_isIncorrect() throws Exception {
        assertEquals("Addition is incorrect",
                4, 2 + 3);
    }
}
