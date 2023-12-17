package codeforces;
import java.util.Scanner;

public class george_and_accommodation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int roomNumber = inp.nextInt();
        int[][] inputs = new int[roomNumber][2];
        int count = 0; 

        for (int i = 0; i < roomNumber; i++) {

            inputs[i][0] = inp.nextInt();
            inputs[i][1] = inp.nextInt();
            
            if (inputs[i][1] - inputs[i][0] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
