import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestFlight {

    private Plane plane;
    private Flight flight;


    @Before
    public void before(){
       plane = new Plane(PlaneType.BIPLANE,Airline.RYANAIR) ;
       flight = new Flight(plane,"ZX213",AirportCode.GLA);
    }

    @Test
    public void hasPlane(){
        assertEquals(plane,flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("ZX213", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Glasgow", flight.getDestination());
    }


}
