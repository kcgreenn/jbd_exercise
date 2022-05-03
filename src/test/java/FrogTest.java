import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FrogTest {
    private Frog frog;

    @Before
    public void setup() throws Exception {
        frog = new Frog("Fido", 10);
    }

    @Test
    public void testGetPoisonLevel(){
        assertEquals(10, frog.getPoisonLevel());
    }
}
