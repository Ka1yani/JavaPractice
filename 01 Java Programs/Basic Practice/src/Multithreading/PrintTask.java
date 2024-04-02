package Multithreading;

public class PrintTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.printf("%d%c ", i, targetchar);
            }
            System.out.printf("\n %s Task complete", Thread.currentThread().getName());
        }
            private final char targetchar;

            public PrintTask(char targetchar){
                this.targetchar = targetchar;
            }
}
