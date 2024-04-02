class BookRideTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Booking Ride");
        try {
            System.out.println("In thread :: "+Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class FindDriverTask implements Runnable {
    public void run() {
        System.out.println("Searching for available drivers...");
        // Simulate searching for available drivers
        try {
            Thread.sleep(3000); // Simulate search time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Found available drivers.");
    }
}

class AssignDriverTask implements Runnable {
    public void run() {
        System.out.println("Assigning driver to user...");
        // Simulate assigning a driver
        try {
            Thread.sleep(2000); // Simulate assignment time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Driver assigned successfully.");
    }
}

class UpdateDriverStatusTask implements Runnable {
    public void run() {
        System.out.println("Updating driver's availability status...");
        // Simulate updating driver's status
        try {
            Thread.sleep(2000); // Simulate update time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Driver's status updated.");
    }
}

class ConfirmRide implements Runnable {
    public void run() {
        System.out.println("Confirming the ride to the user...");
        // Code to confirm the ride
        try {
            Thread.sleep(2000); // Simulate update time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ride Confirmed by user.");
    }
}

public class A03_JoinThreadDemo {
    //CabPoolApplication
    public static void main(String[] args) {
        // Create Runnable objects for each task
        BookRideTask bookRideTask = new BookRideTask();
        FindDriverTask findDriverTask = new FindDriverTask();
        AssignDriverTask assignDriverTask = new AssignDriverTask();
        Runnable updateDriverStatusTask = new UpdateDriverStatusTask();
        Runnable confirmRideTask = new ConfirmRide();
        try {
            //complete this

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // All tasks completed
        System.out.println("All tasks completed. Ride booked successfully!");
    }
}



/*
class FindDriverTask implements Runnable {
    public void run() {
        System.out.println("Searching for available drivers...");
        // Simulate searching for available drivers
        try {
            Thread.sleep(3000); // Simulate search time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Found available drivers.");
    }
}

class AssignDriverTask implements Runnable {
    public void run() {
        System.out.println("Assigning driver to user...");
        // Simulate assigning a driver
        try {
            Thread.sleep(2000); // Simulate assignment time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Driver assigned successfully.");
    }
}

class UpdateDriverStatusTask implements Runnable {
    public void run() {
        System.out.println("Updating driver's availability status...");
        // Simulate updating driver's status
        try {
            Thread.sleep(2000); // Simulate update time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Driver's status updated.");
    }
}

class ConfirmRide implements Runnable {
    public void run() {
        System.out.println("Confirming the ride to the user...");
        // Code to confirm the ride
        try {
            Thread.sleep(2000); // Simulate update time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ride Confirmed by user.");
    }
}

public class A03_JoinThreadDemo {
    //CabPoolApplication
    public static void main(String[] args) {
        // Create Runnable objects for each task
        FindDriverTask findDriverTask = new FindDriverTask();
        AssignDriverTask assignDriverTask = new AssignDriverTask();
       */
/* Runnable updateDriverStatusTask = new UpdateDriverStatusTask();
        Runnable confirmRideTask = new ConfirmRide();*//*


        try {
            // Create threads and start them
            Thread findDriverThread = new Thread(findDriverTask, "FindDriverThread");
            findDriverThread.start();
            // Wait for findDriverThread to complete before proceeding
            findDriverThread.join();

            Thread assignDriverThread = new Thread(assignDriverTask, "Assigning Driver Thread");
            assignDriverThread.start();
            // Wait for assignDriverThread to complete before proceeding
            assignDriverThread.join();

           */
/* Thread updateDriverStatusThread = new Thread(updateDriverStatusTask, "Update Driver Status Thread");
            updateDriverStatusThread.start();
            // Wait for updateDriverStatusThread to complete before proceeding
            updateDriverStatusThread.join();

            Thread confirmRideThread = new Thread(confirmRideTask, "Confirm Ride Thraed");
            confirmRideThread.start();
            //Wait for User to confirm the Ride
            confirmRideThread.join();*//*

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // All tasks completed
        System.out.println("All tasks completed. Ride booked successfully!");
    }
}*/
