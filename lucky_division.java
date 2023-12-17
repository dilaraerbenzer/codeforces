package codeforces;
import java.util.Scanner;

public class lucky_division {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int inputNumber = inp.nextInt();

        int[] luckyNumbers = new int[inputNumber];
        int index = 0;
        boolean isLucky = false;

        for (int i = 1; i <= inputNumber; i++) {

            String string = Integer.toString(i);

            for (int j = 0; j < string.length(); j++) {

                if (string.contains("7") || string.contains("4")) {

                    string = string.replaceAll("4", "");
                    string = string.replaceAll("7", "");

                    if (string.equals("")) {
                        luckyNumbers[index] = i;
                        index++;
                    }
                }
            }

        }

        // counting how many non-zero elements are in the array
        int count = 0;
        for (int value : luckyNumbers) {
            if (value != 0) {
                count++;
            }
        }

        // new array without zeros
        int[] newArray = new int[count];
        int index2 = 0;
        for (int value : luckyNumbers) {
            if (value != 0) {
                newArray[index2++] = value;
            }
        }

        // checking divisibility 
        for (int luckyNumber : newArray) {
            if (inputNumber % luckyNumber == 0) {
                isLucky = true;
            }
        }

        if (isLucky) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
