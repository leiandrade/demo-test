import static org.junit.Assert.*;
import org.junit.*;

public class TestingDemoTest {
    //need to think about testing codes and commands
    @Test
    public void multiplyInts() {        
        assertEquals(35, TestingDemo.multiply(5, 7));     
    }
    
}
