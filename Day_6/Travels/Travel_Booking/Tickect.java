package Day_6.Travels.Travel_Booking;

public class Tickect {
    private String tickectId;
    private String destination;
    private double fare;
    
    public Tickect(){
        
    }
    public Tickect(String tickectId, String destination, double fare) {
        this.tickectId = tickectId;
        this.destination = destination;
        this.fare = fare;
    }
    
    public String getTickectId() {
        return tickectId;
    }
    public void setTickectId(String tickectId) {
        this.tickectId = tickectId;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public double getFare() {
        return fare;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }
}
