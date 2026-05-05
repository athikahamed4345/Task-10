import java.util.Scanner;

public class Factorial {

    static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = s.nextInt();

        System.out.println("Factorial = " + fact(n));
    }
}