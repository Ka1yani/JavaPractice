import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        //int num = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        System.out.  println("Enter the Number");
        int num = sc.nextInt();
        System.out.println(checkPrime(num));
    }

    public static boolean checkPrime(long num) {
        if (num == 1 || num == 0) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for ( int i = 5; i * i < num; i +=6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
