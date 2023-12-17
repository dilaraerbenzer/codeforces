package codeforces;
import java.util.Scanner;

public class string_task {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String inputString = inp.next();
        String charList = "AaEeOoUuIiYy";
        boolean isVowel = false;

        for (int i = 0; i < inputString.length(); i++) {

            for (int j = 0; j < charList.length(); j++) {

                if (inputString.charAt(i) == charList.charAt(j)) {
                    isVowel = true;
                    break;
                }
            }

            if (!isVowel) {
                System.out.print("." + inputString.substring(i, i+1).toLowerCase());
            }

            isVowel = false;
        }

    }
}