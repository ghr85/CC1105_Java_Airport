import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPassenger {
    public Passenger passenger ;
    public Luggage luggage;

    @Before

    public void  before(){
        luggage = new Luggage(23.0, LuggageType.CARGO);
        passenger = new Passenger("Davey");
    }

    @Test

    public void startsWithNoLuggage(){
        assertEquals(0,passenger.luggageCount());
    }

    @Test
    public void canCollectLuggage(){
        passenger.collectLuggage(luggage);
        assertEquals(1,passenger.luggageCount());
    }

    @Test
    public void canDropOffLuggage(){
        passenger.collectLuggage(luggage);
        passenger.collectLuggage(luggage);
        passenger.dropLuggage();
        assertEquals(0,passenger.luggageCount());
    }
    @Test
    public void hasName(){
        assertEquals("Davey",passenger.getName());
    }
}
