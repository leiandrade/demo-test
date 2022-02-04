import static org.junit.Assert.*;
import org.junit.*;

public class TestingDemoTest {
    //need to think about testing codes and commands
    @Test
    public void divide_whenDenominatorIsZero_shouldThrow() {
        assertThrows(ArithmeticException.class, () -> divide(1, 0)); // fails at first!
    }

    private Object divide(int i, int j) {
        return null;
    }
    
}
