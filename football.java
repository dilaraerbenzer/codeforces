package codeforces;
import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        String players = inp.next();
        int count0 = 0;
        int count1 = 0;
        boolean isDangerous = false;

        for (int i = 0; i < players.length(); i++) {
            
            if (players.charAt(i) == '1') {
                count1 ++;
                count0 = 0;
            }

            if (players.charAt(i) == '0') {
                count0++;
                count1 = 0;
            }

            if (count0 >= 7 || count1 >= 7) {
                isDangerous = true;
                break;
            }
        }

        if (isDangerous) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }



    }
}
