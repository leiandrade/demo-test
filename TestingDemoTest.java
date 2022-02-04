import static org.junit.Assert.*;
import org.junit.*;

public class TestingDemoTest {
    //need to think about testing codes and commands
    @Test
    public void divide() {        
        assertEquals(2, TestingDemo.divide(4, 2));     
    }
    
}
