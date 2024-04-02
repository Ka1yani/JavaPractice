package Multithreading;

public class SecondTask extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n %s ",Thread.currentThread().getName() );
    }
}
