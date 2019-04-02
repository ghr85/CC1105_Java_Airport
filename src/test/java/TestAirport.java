import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestAirport {
    private Airport airport;
    private Plane plane;
    private Plane planeAlt;
    private Flight flight;
    private Passenger passenger;
    private Luggage luggage;

    @Before
    public void before(){
        airport = new Airport(AirportCode.GLA);
        plane = new Plane(PlaneType.BIPLANE,Airline.BRITISHAIRWAYS);
        planeAlt = new Plane(PlaneType.PRIVATE, Airline.BRITISHAIRWAYS);
        flight = new Flight(plane,"ZX123",AirportCode.LAX);
        passenger = new Passenger("Davey");
        luggage = new Luggage(28,LuggageType.CARGO);
    }

    @Test
    public void hasAirportName(){
        assertEquals("Glasgow",airport.getName());
    }

    @Test
    public void startsWithEmptyHanger(){
        assertEquals(0,airport.hangarCount());
    }

    @Test
    public void canAddPlane(){
        airport.parkPlane(plane);
        assertEquals(1,airport.hangarCount());
    }

    @Test
    public void canRemovePlane(){
        airport.parkPlane(plane);
        airport.parkPlane(planeAlt);
        airport.removePlane(planeAlt);
        assertEquals(1,airport.hangarCount());
    }

}
