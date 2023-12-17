package codeforces;
import java.util.Scanner;

public class next_round {
    public static void main(String[] args) {
        // creating scanner object
        Scanner inp = new Scanner(System.in);

        // initialising variables
        int numberOfContestants = inp.nextInt();
        int numberOfPassing = inp.nextInt(); // number of passing contestants

        // array to store all scores
        int[] scores = new int[numberOfContestants];

        for (int i = 0; i < numberOfContestants; i++) { // getting inputs for the scores
            scores[i] = inp.nextInt();
        }

        int passers = 0;

        for (int i = 0; i < numberOfContestants; i++) {

            if (scores[i] > 0 && scores[i] >= scores[numberOfPassing - 1]) {
                passers++;
            }

            else {
                break;
            }
                  
        }

        System.out.println(passers);

    }
}