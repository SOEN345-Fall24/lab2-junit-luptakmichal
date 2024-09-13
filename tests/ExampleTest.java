import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testFunction_A_PositiveY() {
        Example example = new Example(3, 4);
        int result = example.Function_A(5);
        assertEquals(8, result);
    }

    @Test
    public void testFunction_A_NegativeY() {
        Example example = new Example(3, 4);
        int result = example.Function_A(-5);
        assertEquals(-8, result);
    }

    @Test
    public void testFunction_B_XLessThanSix() {
        Example example = new Example(3, 4);
        int result = example.Function_B(3);
        assertEquals(7, result);
    }

    @Test
    public void testFunction_B_XGreaterThanOrEqualSix() {
        Example example = new Example(3, 4);
        int result = example.Function_B(6);
        assertEquals(2, result);
    }
}
