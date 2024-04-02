class ChoppingVegetables extends Thread {
    ChoppingVegetables() {
        super();
    }
    ChoppingVegetables(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
       try{
           /*System.out.println("Chopping Vegetables thread Running");
           System.out.println("Current thread Name :: "+ Thread.currentThread().getName() + " Id :: " + Thread.currentThread().getId());*/
           for(int i = 1;i<=10;i++) {
               System.out.println(Thread.currentThread().getName()+"_"+i);
               Thread.sleep(1000);
           }
       } catch (InterruptedException e) {
           System.out.println("Thread experienced an Interrupted Exception "+ e.getMessage());
       }
    }
}


class BoilingWater implements Runnable {
    @Override
    public void run() {
        try {
            /*System.out.println("Boiling Water thread running");
            System.out.println("Current thread Name :: "+ Thread.currentThread().getName() + " Id :: " + Thread.currentThread().getId());*/
            for (int i = 1;i<=10;i++) {
                System.out.println(Thread.currentThread().getName()+"_"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread experienced an Interrupted Exception "+ e.getMessage());
        }
    }
}

public class A01_CreatingThreads {
    public static void main(String[] args) {
        System.out.println("Initial thread Name :: "+ Thread.currentThread().getName() + " Id :: " + Thread.currentThread().getId());
        //Difference between calling run() and start()
        ChoppingVegetables choppingVegetables = new ChoppingVegetables("Vegetable Chopper");
        choppingVegetables.start();
        /*
            OUTPUT : Initial thread Name :: main Id :: 1
                     Chopping Vegetables thread Running
                     Current thread Name :: Vegetable Chopper Id :: 15
         */
        //Not Suggested
        /* ChoppingVegetables choppingVegetables1 = new ChoppingVegetables("Vegetable Chopper using run");
        choppingVegetables1.run();*/
        /*
            OUTPUT : Initial thread Name :: main Id :: 1
                     Chopping Vegetables thread Running
                     Current thread Name :: main Id :: 1
         */

        Thread boilingWaterThread = new Thread(new BoilingWater(), "Water Boiler");
        boilingWaterThread.start();


        //Starting multiple Threads
        /*for(int i=1;i<=3;i++) {
            ChoppingVegetables vegetableChopper  = new ChoppingVegetables("Vegetable Chopper"+i);
            if(i == 2) {
                vegetableChopper.setPriority(Thread.MAX_PRIORITY);
            }
            vegetableChopper.start();
        }

        for(int i=1;i<=3;i++) {
            Thread boilingWater = new Thread(new BoilingWater(), "Water Boiler"+i);
            boilingWater.start();
        }*/

    }
}

