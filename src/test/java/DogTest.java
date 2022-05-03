import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DogTest {
    private Dog dog;

    @Before
    public void setup() throws Exception {
        dog = new Dog("Fido", "black");
    }

    @Test
    public void testGetName(){
        assertEquals("Fido", dog.getName());
    }

    @Test
    public void testGetFurColor(){
        assertEquals("black", dog.getFurColor());
    }
}
