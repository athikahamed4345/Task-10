import java.util.*;

public class Duplicates {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int[] a = new int[n];

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            set.add(a[i]);
        }

        System.out.println("After removing duplicates: " + set);
    }
}