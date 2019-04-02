public enum AirportCode {
    GLA("Glasgow"),
    ABZ("Aberdeen"),
    LAX("Los Angeles"),
    PCG("Paris Charles De Gaulle");

    public String airportDestinationPretty;

     AirportCode(String prettyPrint){
        this.airportDestinationPretty = prettyPrint;
    }
    public String getFullName(){
         return this.airportDestinationPretty;
    }
}
