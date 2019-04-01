import java.lang.reflect.Array;
import java.util.ArrayList;

public class Passenger {
    private String name;
    private ArrayList<Luggage> luggage;

    public Passenger(String name){
        this.name = name;
        this.luggage = new ArrayList<>();
    }

    public int luggageCount(){
        return this.luggage.size();
    }

    public String getName(){
        return this.name;
    }
}
