package codeforces;
import java.util.Scanner; 

public class tram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int stops = inp.nextInt();
        int[][] passengers = new int[2][stops];
        int sum = 0;
        int maxSum = 0;
        
        for (int i = 0; i < stops; i++) {

            passengers[0][i] = inp.nextInt();
            passengers[1][i] = inp.nextInt();
            sum += passengers[1][i] - passengers[0][i];

            if (sum >= maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);

    }
}
