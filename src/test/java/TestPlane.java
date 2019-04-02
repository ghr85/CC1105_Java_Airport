import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPlane {
    public Plane plane;

    @Before
    public void before(){
        this.plane = new Plane(PlaneType.BOEING747, Airline.RYANAIR);
    }

    @Test

    public void hasType(){
        assertEquals(PlaneType.BOEING747,plane.getType());
    }

    @Test
    public void hasAirline(){
        assertEquals(Airline.RYANAIR, plane.getAirline());
    }

    @Test

    public void startsWithEmptyPassengers(){
        assertEquals(0,plane.countPassengers());
    }
}

