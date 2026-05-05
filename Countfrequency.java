import java.util.*;

public class Countfrequency {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = s.nextLine();

        String[] words = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            int count = map.getOrDefault(word, 0);
            map.put(word, count + 1);
        }

        System.out.println(map);
    }
}