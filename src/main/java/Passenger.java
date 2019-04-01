import java.lang.reflect.Array;
import java.util.ArrayList;

public class Passenger {
    private String name;
    private ArrayList<Luggage> luggage;
    private ArrayList<Luggage> baggageHandler;

    public Passenger(String name){
        this.name = name;
        this.luggage = new ArrayList<>();
    }

    public int luggageCount(){
        return this.luggage.size();
    }

    public void collectLuggage(Luggage luggageItem){
        this.luggage.add(luggageItem);
    }

    public ArrayList dropLuggage(){
        baggageHandler = this.luggage;
         this.luggage.clear();
         return baggageHandler;
    }

    public String getName(){
        return this.name;
    }
}
