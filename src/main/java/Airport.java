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


   public Plane assignPlane(Plane plane){
         int index = this.hangar.indexOf(plane);
         Plane flightPlane = this.hangar.get(index);
         this.removePlane(flightPlane);
         return flightPlane;
   }

   public void removePlane(Plane plane){
       this.hangar.remove(plane);
   }

   public Flight createFlight(Plane plane,String flightNumber,AirportCode airportCode){
   return new Flight(plane, flightNumber,airportCode);
   }

   public boolean containsPlane(Plane plane){
       return this.hangar.contains(plane);
   }






}
