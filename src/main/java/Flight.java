//Every flight should have:
//
//        * a plane
//        * flight number
//        * destination

public class Flight {
    private Plane plane;
    private String flightNumber;
    private AirportCode destination;

    public Flight(Plane plane, String flightNumber, AirportCode destination){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }
    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination.getDestination();
    }



}
