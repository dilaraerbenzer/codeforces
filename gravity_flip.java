import java.util.*;

public class gravity_flip {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int noOfColumns = inp.nextInt();
        int[] cubes = new int[noOfColumns];

        for (int i = 0; i < noOfColumns; i++) {
            cubes[i] = inp.nextInt();
        }


        // gravity switch

        // sorting the array

        for (int j = 0; j < noOfColumns; j++) {
            
            for (int i = 1; i < noOfColumns - j; i++) {
        
            if (cubes[i - 1] > cubes[i]) {
                int temp = cubes[i - 1];
                cubes[i - 1] = cubes[i];
                cubes[i] = temp;
            }

            }
        }
        

        for (int i = 0; i < cubes.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(cubes[i]);
        }

        
    }
}
