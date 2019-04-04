public class Ticket {

    private Flight flight;
    private String destination;
    private int ticketNumber;
    private static int ticketCount;
    private String name;

    public Ticket(Flight flight, Passenger passenger){
    this.destination = flight.getDestination();
    ticketCount += 1;
    this.ticketNumber = ticketCount;
    }

    public String getDestination(){
        return this.destination;
    }

    public int getTicketNumber(){
        return this.ticketNumber;
    }
}
