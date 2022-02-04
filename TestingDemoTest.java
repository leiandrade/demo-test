import static org.junit.Assert.*;
import org.junit.*;

public class TestingDemoTest {
    //need to think about testing codes and commands
    @Test
    public void addition() {
        assertEquals(2, TestingDemo.add(1, 3)); // fails at first!
    }
    
}
