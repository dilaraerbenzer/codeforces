package codeforces;
import java.util.Scanner;

public class in_search_of_an_easy_problem {
    public static void main(String[] args) {
        // creating scanner object
        Scanner inp = new Scanner(System.in);

        int contestantNumber = inp.nextInt();
        int[] answers = new int[contestantNumber];
        boolean isHard = false;

        for (int i = 0; i < contestantNumber; i++) {
            answers[i] = inp.nextInt();
        }

        for (int answer : answers) {
            if (answer == 1) {
                isHard = true;
            }
        }

        if (isHard) {
            System.out.println("HARD");
        }

        else {
            System.out.println("EASY");
        }
    }
}
