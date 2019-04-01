import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestLuggage {
    public Luggage luggage;

    @Before
    public void before(){
        luggage = new Luggage(23.0, LuggageType.CARGO);
    }

    @Test
    public void hasWeight(){
        assertEquals(23.0,luggage.getWeight());
    }

    @Test
}
