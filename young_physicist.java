package codeforces;
import java.util.Scanner;

public class young_physicist {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numberOfForces = inp.nextInt();
        int[][] forces = new int[numberOfForces][3];
        int sumx = 0;
        int sumy = 0;
        int sumz = 0;

         for (int i = 0; i < numberOfForces; i++) {

            for (int j = 0; j < 3; j++) {

                forces[i][j] = inp.nextInt();

                if (j == 0) {
                    sumx += forces[i][j];
                }

                else if (j == 1) {
                    sumy += forces[i][j];
                }

                else {
                    sumz += forces[i][j];
                }
                
                  
            }
            
        }

        if (sumx == sumy && sumx == sumz && sumx == 0) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
