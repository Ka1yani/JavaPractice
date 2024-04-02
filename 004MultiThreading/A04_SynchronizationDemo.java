class RailwayReservationSystem {
    private int availableSeats = 2;

    public void bookSeat(String passenger, int seats) {
        if (availableSeats >= seats) {
            System.out.println(passenger + " is booking " + seats + " seats.");
            try {
                Thread.sleep(1000); // Simulate booking time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            availableSeats -= seats;
            System.out.println("Booking successful for "+ passenger + " Available seats: " + availableSeats);
        } else {
            System.out.println("Sorry, " + passenger + ", not enough seats available.");
        }
    }
}

class Passenger extends Thread {
    private RailwayReservationSystem reservationSystem;
    private String name;
    private int seats;

    public Passenger(RailwayReservationSystem reservationSystem, String name, int seats) {
        this.reservationSystem = reservationSystem;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        reservationSystem.bookSeat(name, seats);
    }
}

public class A04_SynchronizationDemo {
    public static void main(String[] args) {
        RailwayReservationSystem reservationSystem = new RailwayReservationSystem();
        Passenger passenger1 = new Passenger(reservationSystem, "Passenger 1", 2);
        Passenger passenger2 = new Passenger(reservationSystem, "Passenger 2", 1);

        passenger1.start();
        passenger2.start();
    }
}
