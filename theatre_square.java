package codeforces;
import java.util.Scanner;

public class theatre_square {
    public static void main(String[] args) {

        // creating scanner object
        Scanner inp = new Scanner(System.in);
        int[] sides = new int[3];
        long flagStones = 0;
        long m = 0;
        long n = 0;

        // getting input from user
        for (int i = 0; i < 3; i++) {
            sides[i] = inp.nextInt();
            // index 0 is width
            // index 1 is height
            // index 2 is square side
        }


        m = sides[0] / sides[2] + (sides[0] % sides[2] == 0 ? 0 : 1);

        n = sides[1] / sides[2] + (sides[1] % sides[2] == 0 ? 0 : 1);
   
        flagStones = m * n;


        System.out.println(flagStones);
        
    }
}