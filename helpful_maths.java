
package codeforces;
import java.util.Scanner;
import java.util.Arrays;

public class helpful_maths {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String inputString = inp.next();
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '+') {
                count++;
            }
        }

        int[] numbers = new int[count + 1];
        String reducedString = inputString;
        String secondString = "";
        int index = 0;

        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) == '+') {
                reducedString = inputString.substring(i-1, i);
                secondString = inputString.substring(i);
                numbers[index] = Integer.parseInt(reducedString);
                reducedString = secondString;
                index++;
            }   
        }

        if (count > 0) {
            numbers[index] = Integer.parseInt(reducedString.substring(reducedString.length() - 1, reducedString.length()));

        }

        else {
            numbers[index] = Integer.parseInt(inputString);
        }

        Arrays.sort(numbers);
        System.out.print(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            System.out.print("+" + numbers[i]);
        }
            

    }
}