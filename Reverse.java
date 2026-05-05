import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s1.nextInt();

        int s = 0;

        while(n > 0) {
            int r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }

        System.out.println("Reverse Number = " + s);
    }
}