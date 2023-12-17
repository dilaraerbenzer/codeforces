package codeforces;
import java.util.Scanner;

public class wrong_subtraction {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int[] inputs = new int[2];
    
    for (int i = 0; i < 2; i++) {
        inputs[i] = inp.nextInt();
    }
    
    int divisionNumber = inputs[1];
    int inputNumber = inputs[0];

    for (int i = 0; i < divisionNumber; i++) {

        if (inputNumber % 10 != 0) {
            inputNumber--;
        }

        else {
            inputNumber = inputNumber / 10;   
        }

    }

    System.out.println(inputNumber);

    }
}
