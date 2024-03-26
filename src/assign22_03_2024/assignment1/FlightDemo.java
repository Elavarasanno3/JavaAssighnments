package assign22_03_2024.assignment1;

class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private int duration;
    private double price;

    // Static variables
    private static int totalFlights = 0;

    public Flight(String flightNumber, String origin, String destination, int duration, double price) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalFlights() {
        return totalFlights;
    }

    public static void setTotalFlights(int totalFlights) {
        Flight.totalFlights = totalFlights;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}

public class FlightDemo{
    public static void main(String[] args) {
        Flight flight = new Flight("1234567","Chennai","Delhi",3,4000.00);
        System.out.println(flight.toString());
    }

}
