package codeforces;
import java.util.Scanner;

public class word_capitalisation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String word = inp.next();

        String wordFinal = word.substring(0,1).toUpperCase();

        wordFinal += word.substring(1);

        System.out.println(wordFinal);
    }
}
