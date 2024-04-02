class AirlineReservationSystem {
    private int availableSeats = 3;

    public synchronized void bookSeat(String passenger, int seats) {
        while (availableSeats < seats) {
            try {
                System.out.println(passenger + " is waiting for seats.");
                wait(); // Passenger waits if seats are not available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(passenger + " is booking " + seats + " seats.");
        try {
            Thread.sleep(1000); // Simulate booking time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        availableSeats -= seats;
        System.out.println("Booking successful. Available seats: " + availableSeats);
        notifyAll(); // Notify waiting passengers after booking
    }
}

class FlightPassenger extends Thread {
    private AirlineReservationSystem reservationSystem;
    private String name;
    private int seats;

    public FlightPassenger(AirlineReservationSystem reservationSystem, String name, int seats) {
        this.reservationSystem = reservationSystem;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        reservationSystem.bookSeat(name, seats);
    }
}

public class A05_InterThreadCommunication {
    public static void main(String[] args) {
        AirlineReservationSystem reservationSystem = new AirlineReservationSystem();
        FlightPassenger flightPassenger1 = new FlightPassenger(reservationSystem, "Passenger 1", 1);
        FlightPassenger flightPassenger2 = new FlightPassenger(reservationSystem, "Passenger 2", 2);
        FlightPassenger flightPassenger3 = new FlightPassenger(reservationSystem, "Passenger 3", 3);

        flightPassenger1.start();
        flightPassenger2.start();
        flightPassenger3.start();

        try {
            flightPassenger1.join();
            flightPassenger2.join();
            flightPassenger3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All passengers have completed booking. Flight fully booked.");
    }
}