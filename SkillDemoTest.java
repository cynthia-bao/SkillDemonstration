import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    //test multiplication function
    @Test
    public void mult() {
        //fail test
        assertEquals(4, SkillDemo.mult(3, 2));
    }
}
