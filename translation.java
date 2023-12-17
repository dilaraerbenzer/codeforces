package codeforces;
import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.next();
        int length = word.length();
        String reverseWord = inp.next();
        String reducedWord = "";

        for (int i = 0; i < length; i++) {
            String ch = word.substring(word.length() - i - 1, word.length() - i);
            reducedWord += ch;

        }

        if (reverseWord.equals(reducedWord)) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
