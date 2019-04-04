import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTicket {
    private Ticket ticket;
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
        ticket = new Ticket(flight,passenger)  ;
    }
    @Test
    public void canGetDestination(){
        assertEquals("Los Angeles",ticket.getDestination());
    }

    @Test
    public void canGetTicketNumberIncrement(){
        Ticket ticket2 = new Ticket(flight,passenger);
        assertEquals(2,ticket2.getTicketNumber());
    }

}
