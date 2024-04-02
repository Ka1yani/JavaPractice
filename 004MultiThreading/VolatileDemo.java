public class VolatileDemo {
    private boolean flag = false; // Shared flag variable

    public void setFlag() {
        // This method is called by one thread to set the flag
        flag = true;
    }

    public boolean isFlagSet() {
        // This method is called by other threads to check if the flag is set
        return flag;
    }

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();

        // Thread to set the flag
        Thread setterThread = new Thread(() -> {
            volatileDemo.setFlag();
            System.out.println("Flag has been set");
        });

        // Thread to check if the flag is set
        Thread checkerThread = new Thread(() -> {
            while (!volatileDemo.isFlagSet()) {
                // Wait until the flag is set
            }
            System.out.println("Flag is set, continuing execution");
        });

        setterThread.start();
        checkerThread.start();
    }
}
