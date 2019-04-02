//Each plane should have:
//
//        * a type (e.g. *BOEING747*) which stores the passenger capacity (**HINT**: _ENUM_!?)
//        * an airline
//        * a collection of passengers

public class Plane {
    private PlaneType type;
    private Airline airline;

    public Plane(PlaneType type, Airline airline){
    this.type = type;
    this.airline = airline;
    }

    public PlaneType getType(){
        return this.type;
    }

    public Airline getAirline(){
        return this.airline;
    }

}
