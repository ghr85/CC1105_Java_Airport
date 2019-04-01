public class Luggage {
    private double weight;
    private LuggageType type;

    public Luggage(double weight, LuggageType type){
        this.weight = weight;
        this.type = type;
    }

    public double getWeight(){
        return this.weight;
    }
}
