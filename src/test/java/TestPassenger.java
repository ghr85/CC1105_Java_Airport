import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPassenger {
    public Passenger passenger ;
    public Luggage luggage;
    public Ticket ticket;
    public Plane plane;
    public Flight flight;

    @Before

    public void  before(){
        luggage = new Luggage(23.0, LuggageType.CARGO);
        passenger = new Passenger("Davey");
        plane = new Plane(PlaneType.BIPLANE,Airline.BRITISHAIRWAYS);
        flight = new Flight(plane,"ZX123",AirportCode.LAX);
        ticket = new Ticket(flight,passenger)  ;
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

    @Test
    public void canGetTicket(){
        passenger.collectTicket(ticket);
        passenger.collectTicket(ticket);
        assertEquals("Los Angeles 1", passenger.showTicket());
    }
}
