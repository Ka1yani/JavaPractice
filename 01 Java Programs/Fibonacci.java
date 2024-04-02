class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        int count = Integer.parseInt(args[0]);
        System.out.print("Using Iteration : ");
        System.out.print(n1 + " " + n2);
        for(int i = 0; i<count;i++){
            n3 = n1+n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
        }

        System.out.print("\nUsing Recursion : ");
        System.out.print(0 + " " + 1);
        printFibonacci(count, 0, 1);
    }

    public static void printFibonacci(int count, int n1, int n2) {
        if(count > 0){
            int n3 = n1+n2;
            System.out.print(" "+ n3);
            printFibonacci(--count, n2, n3);
        }
    }
}
