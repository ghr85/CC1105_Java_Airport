import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPlane {
    public Plane plane;

    @Before
    public void before(){
        this.plane = new Plane(BOEING, RYANAIR);
    }

    @Test

    public void hasType(){
        assertEquals("Boeing",plane.getType());
    }
}
