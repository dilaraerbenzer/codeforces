package codeforces;

import java.util.Scanner;

public class minor_reduction {
    public static void main (String[] args) {
        // zatirizort
        Scanner inp = new Scanner(System.in);
        int numberOfInputs = inp.nextInt();
        inp.nextLine();
        String numberString = "";
        String[] numbers = new String[numberOfInputs];
        boolean girsin = true;
        int sum = 0;
        int maxIndex = 123;

        // getting inputs to store them in arrays
        for (int a = 0; a < numberOfInputs; a++) {
            numbers[a] = inp.next();
        }

        // printing for each element of the number array
        for (int i = 0; i < numbers.length; i++) {

            // check for every 2-digit character from every element
            for (int j = 0; j < numbers[i].length() - 1; j++) {
                sum = Integer.parseInt(numbers[i].substring(j, j+1)) + Integer.parseInt(numbers[i].substring(j+1, j+2));
                
                if ( sum >= 10) {
                    maxIndex = j;
                    girsin = false;

                }  

                else if (girsin && maxIndex > j) {
                    maxIndex = 0;
                }

            }

            sum = Integer.parseInt(numbers[i].substring(maxIndex, maxIndex+1)) + Integer.parseInt(numbers[i].substring(maxIndex+1, maxIndex+2));

            String string1 = numbers[i].substring(0,maxIndex);
            String string2 = numbers[i].substring(maxIndex+2);
            numberString = string1 + Integer.toString(sum) + string2;
            
            girsin = true;
            System.out.println(numberString);
        }      
    }
}