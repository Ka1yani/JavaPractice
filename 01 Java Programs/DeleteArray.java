import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int arr[] = {3, 8, 12, 5 ,6};
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");*/
        deletelement(arr, arr.length, 12);
    }

    public static int deletelement(int arr[], int n, int x) {
        int i;
        for(i = 0; i < n; i++) {
            if (arr[i] == x) break;
        }
        if (i == n) return n;
        for(int j = i; j < n-1; j++){
            arr[j] = arr[j+1];
        }
        for(int k = 0; k < n - 1; k++){
            System.out.print(arr[k]);
        }
        return (n-1);
    }
}
