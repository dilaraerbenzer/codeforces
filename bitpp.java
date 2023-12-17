package codeforces;

import java.util.Scanner;

public class bitpp {
    public static void main(String[] args) {
        // creating scanner object
        Scanner inp = new Scanner(System.in);

        // getting input from user
        int numberOfOperations = inp.nextInt();
        inp.nextLine();

        // initialising string array
        String[] operations = new String[numberOfOperations];
        int x = 0;

        for (int i = 0; i < numberOfOperations; i++) {
            operations[i] = inp.next();
        }

        for (int i = 0; i < numberOfOperations; i++) {
            if (operations[i].contains("+")) {
                x++;
            }

            else if (operations[i].contains("-")) {
                x--;
            }
        }

        System.out.println(x);
    }
    
}
