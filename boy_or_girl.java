package codeforces;
import java.util.Scanner;

public class boy_or_girl {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username = inp.next();
        String reducedUsername = "";
        int count = 0;

        for (int i = 0; i < username.length(); i++) {
            String ch = username.substring(i, i+1);
            count++;

            for (int j = 0; j < username.length(); j++) {
                if (reducedUsername.contains(ch)) {
                    count--;
                    reducedUsername = reducedUsername.replaceFirst(ch, "");
                }
            }

            reducedUsername += ch;

        }
            if (count % 2 == 0) {
                System.out.println("CHAT WITH HER!");
            }

            else {
                System.out.println("IGNORE HIM!");
            }
    }
}
