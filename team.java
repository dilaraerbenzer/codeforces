package codeforces;
import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        // creating scanner object
        Scanner inp = new Scanner(System.in);
        int numberOfQuestions = inp.nextInt();
        int sum = 0;
        int[][] sureness = new int[numberOfQuestions][3];
        int questions = 0;

        for (int i = 0; i < numberOfQuestions; i++) { // getting input for number of kids in each group
            for (int j = 0; j < 3; j++) {
                sureness[i][j] = inp.nextInt(); 
                sum += sureness[i][j];
                
            }

            if (sum >= 2) {
                    questions++;
                }

                sum = 0;

        }

        System.out.println(questions);
    }
}
