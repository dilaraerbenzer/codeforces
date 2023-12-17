import java.util.ArrayList;
import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int noOfChars = inp.nextInt();
        String input = inp.next();
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < noOfChars; i++) {
            addUnique(chars, Character.toLowerCase(input.charAt(i)));
        }

        if (chars.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void addUnique(ArrayList<Character> list, char ch) {
        // Check if the char is not already in the list
        if (!list.contains(ch)) {
            // Add the char to the list
            list.add(ch);
        }
    }
}
