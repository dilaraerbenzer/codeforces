package codeforces;
import java.util.Scanner;
import java.lang.Math;

public class beautiful_matrix {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[][] numbers = new int[4][5];
        int x = 0;
        int y = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = inp.nextInt();
                if ((numbers[i][j]) == 1 ) {
                  x = i;
                  y = j;  
                }
            }
            
        }

        int moves = Math.abs(x - 2);
        moves += Math.abs(y-2);

        System.out.println(moves);
    }
}
