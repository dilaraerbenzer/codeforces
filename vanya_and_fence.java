package codeforces;
import java.util.Scanner;

public class vanya_and_fence {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] inputs = new int[2];

        for (int i = 0; i < 2; i++) {
            inputs[i] = inp.nextInt();
        }

        int numberOfFriends = inputs[0];
        int fenceHeight = inputs[1];
        int count = 0;

        for (int i = 0; i < numberOfFriends; i++) {
            int height = inp.nextInt();
            
            if (height > fenceHeight) {
                count += 2;
            }

            else {
                count++;    
            }
        }

        System.out.println(count);
     }
}
