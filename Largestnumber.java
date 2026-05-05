import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(a[i] > first) {
                second = first;
                first = a[i];
            }
            else if(a[i] > second && a[i] != first) {
                second = a[i];
            }
        }

        System.out.println("Second Largest Number: " + second);
    }
}