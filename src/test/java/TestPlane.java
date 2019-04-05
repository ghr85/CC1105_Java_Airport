import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPlane {
    private Plane plane;
    private Passenger passenger;

    @Before
    public void before() {
        this.plane = new Plane(PlaneType.BOEING747, Airline.RYANAIR);
        this.passenger = new Passenger("Davey");
    }

    @Test

    public void hasType() {
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void hasAirline() {
        assertEquals(Airline.RYANAIR, plane.getAirline());
    }

    @Test

    public void startsWithEmptyPassengers() {
        assertEquals(0, plane.countPassengers());
    }


    @Test
    public void canCountCapacity() {
        assertEquals(300, plane.countCapacity());
    }

    @Test
    public void canAddPassengerToPlane(){
        plane.addPassenger(passenger);
        assertEquals(1,plane.countPassengers());
    }
}

