import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    public void test() {
        int expected = 1;
        int actual = getActual();
        assertEquals(expected, actual);
    }

    private int getActual() {
        return 1;
    }

}
