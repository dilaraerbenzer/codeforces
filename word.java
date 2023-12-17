package codeforces;
import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.next();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'a') {
                lowerCaseCount++;
            }

            else {
                upperCaseCount++;
            }
        }

        if (lowerCaseCount >= upperCaseCount) {
            System.out.println(word.toLowerCase());
        }

        else {
            System.out.println(word.toUpperCase());
        }

    }
}
