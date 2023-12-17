import java.util.*;

public class candies_and_two_sisters {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int noOfCases = inp.nextInt();

        long[] numbers = new long[noOfCases];
        long[] solutions = new long[noOfCases];

        for (int i = 0; i < noOfCases; i++) {
            numbers[i] = inp.nextLong();
            if (numbers[i] % 2 == 0) {
                solutions[i] = ( numbers[i] / 2 ) - 1 ;
            }

            else {
                solutions[i] = ( numbers[i] - 1) / 2;
            }
        }

        for (long solution : solutions) {
            System.out.println(solution);
        }

        
    }
}
