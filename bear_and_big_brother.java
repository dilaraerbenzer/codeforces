package codeforces;
import java.util.Scanner;

public class bear_and_big_brother {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] weights = new int[2];

        for (int i = 0; i < weights.length; i++) {
            weights[i] = inp.nextInt();
        }

        int limak = weights[0];
        int bob = weights[1];
        int count = 0;

        do {
            limak = limak * 3;
            bob = bob * 2;
            count++;
        }
        while ( limak <= bob);

        System.out.println(count);
    }
}
