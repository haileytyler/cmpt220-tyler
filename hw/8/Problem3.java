import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {
        // Program that has a flight class that stores the information and an Itinerary class

        ArrayList<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight("US230",
        new GregorianCalendar(2014, 4, 5, 5, 5, 0),
        new GregorianCalendar(2014, 4, 5, 6, 15, 0))); // 1 hour and 10 minutes = 70 minutes
        flights.add(new Flight("US235",
        new GregorianCalendar(2014, 4, 5, 6, 55, 0), // 40 minutes b/t flights
        new GregorianCalendar(2014, 4, 5, 7, 45, 0))); // 50 minutes
        flights.add(new Flight("US237",
        new GregorianCalendar(2014, 4, 5, 9, 35, 0), // 110 minutes b/t flights
        new GregorianCalendar(2014, 4, 5, 12, 55, 0))); // 3 hours and 20 minutes = 200 minutes

        Itinerary itinerary = new Itinerary(flights);
        System.out.println(itinerary.getTotalTravelTime());
        System.out.println(itinerary.getTotalFlightTime());
    }
}
class Flight {
    // data fields
    private String flightNo;
    private  GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;
    // contruct a flight object
    Flight() {
    }
    // contruct a flight object
    Flight(String newFlightNo, GregorianCalendar newDepartureTime, GregorianCalendar newArrivalTime) {
        flightNo = newFlightNo;
        departureTime = newDepartureTime;
        arrivalTime = newArrivalTime;
    }
    // return the flight number
    String getFlightNo () {
        return flightNo;
    }
    // return the departure time
    GregorianCalendar getDepartureTime () {
        return departureTime;
    }
    // set the departure time
    void setDepartureTime (GregorianCalendar newDepartureTime) {
        departureTime = newDepartureTime;
    }
    // get the arrival time
    GregorianCalendar getArrivalTime () {
        return arrivalTime;
    }
    // set the arrival time
    void setArrivalTime (GregorianCalendar newArrivalTime) {
        arrivalTime = newArrivalTime;
    }
    // get the flight time in minutes
    long getFlightTime() {
        return (arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis()) / 60000;
    }
}
class Itinerary {
    // data fields
    ArrayList<Flight> flights;
    // contruct an itinerary object
    Itinerary (){
    }
    // contruct an itinerary object
    Itinerary (ArrayList<Flight> newFlights) {
        flights = newFlights;
    }
    // get the total flight time
    long getTotalFlightTime() {
        long TotalFlightTime = 0;
        for (int i = 0; i < flights.size(); i++) {
            TotalFlightTime += flights.get(i).getFlightTime();
        }
        return TotalFlightTime;
    }
    // get the total travel time
    long getTotalTravelTime() {
        Flight firstFlight = flights.get(0);
        Flight lastFlight = flights.get(flights.size() - 1);

        return (lastFlight.getArrivalTime().getTimeInMillis() - firstFlight.getDepartureTime().getTimeInMillis()) / 60000;
    }
}
