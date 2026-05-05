import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = s.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        System.out.println("Vowels = " + count);
    }
}