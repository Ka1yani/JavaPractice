import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        long num = sc.nextInt();
        System.out.println("Reversed number is  : " + getReverseRecursive(num, 0));
    }

    public static long getReverse(long num) {
        long rev = 0, rem;
        while(num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        return rev;
    }

    public static long getReverseRecursive(long num, long rev) {
        if ( num == 0) return rev;
        rev = (rev * 10) + (num % 10);
        return getReverseRecursive(num/10, rev);
    }
}
