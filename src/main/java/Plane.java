//Each plane should have:
//
//        * a type (e.g. *BOEING747*) which stores the passenger capacity (**HINT**: _ENUM_!?)
//        * an airline
//        * a collection of passengers

import java.util.ArrayList;

public class Plane {
    private PlaneType type;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType type, Airline airline){
    this.type = type;
    this.airline = airline;
    this.passengers = new ArrayList<>();
    }

    public PlaneType getType(){
        return this.type;
    }

    public Airline getAirline(){
        return this.airline;
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public int countCapacity(){
        return this.type.getValue();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }
}
