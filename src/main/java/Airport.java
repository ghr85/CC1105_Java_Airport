//
//The airport should have:
//
//        * a collection of hangars (to store the planes)
//        * an airport code (e.g. _GLA_)
//
//        The airport should be able to:
//
//        * create flights
//        * assign planes from the hangar to flights
//        * sell tickets for flights

import java.util.ArrayList;

public class Airport {

    private AirportCode  airportName;
   private ArrayList<Plane> hangar;

   public Airport(AirportCode airportName){
       this.airportName = airportName;
       this.hangar = new ArrayList<>();
   }

   public String getName(){
       return this.airportName.getFullName();
   }

   public int hangarCount(){
       return this.hangar.size();
   }

   public void parkPlane(Plane plane){
       this.hangar.add(plane);
   }

   public void removePlane(Plane plane){
       this.hangar.remove(plane);
   }




}
