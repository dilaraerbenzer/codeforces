package codeforces;
import java.util.Scanner;

public class waytoolongwords {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int numberOfWords = inp.nextInt();
       inp.nextLine();
       String[] words = new String[numberOfWords];

        for (int i = 0; i < numberOfWords; i ++) {
            words[i] = inp.next();

        }

        for (int i = 0; i < numberOfWords; i++) {

            if (words[i].length() > 10) {
                int length = words[i].length() - 2;
                
                System.out.println(words[i].substring(0,1) + "" + length + words[i].substring(words[i].length() - 1, words[i].length()));
            }

            else {
                System.out.println(words[i]);
            }
        }
        


    }
}
