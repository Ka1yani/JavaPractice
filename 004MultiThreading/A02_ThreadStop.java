class MakingChai implements Runnable {
    private volatile boolean exit = false;
    @Override
    public void run() {
       while(!exit) {
           System.out.println("Boiling water...");
           try {
               System.out.println("Adding Chai");
               int i = 5;
               while(i!=0 && !exit) {
                   System.out.println("Boiling chai...");
                   Thread.sleep(1000);
                   --i;
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("Chai is Ready");
       }
    }


    public void stopThread() {
        exit = true;
    }
}

public class A02_ThreadStop {
    public static void main(String[] args) throws InterruptedException {
        MakingChai makeChaiRunnable = new MakingChai();
        Thread makeChai = new Thread(makeChaiRunnable, "Chai Maker");
        makeChai.start();
        //Abruptly stopping after 3 seconds
        /*Thread.sleep(6000);
        makeChai.stop();*/

        //Two Ways to override Stop() Properly
        //1 using a boolean flag
        Thread.sleep(6000);
        makeChaiRunnable.stopThread();
    }
}

 /*@Override
    public void run() {
        System.out.println("Boiling water...");
        try {
            System.out.println("Adding Chai");
            int i = 5;
            while (i != 0 && !Thread.interrupted()) {
                System.out.println("Boiling chai...");
                Thread.sleep(1000);
                --i;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("Chai is Ready");
    }*/