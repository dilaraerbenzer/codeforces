package codeforces;
import java.util.Scanner;

public class beautiful_year {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int inputYear = inp.nextInt();

        boolean isDistinct = true;
        int year = 0;
        String digits = "";

        do {
            
            inputYear++;

            year = inputYear;

            while (year != 0) {
                
                int digit = year % 10;
                year = year / 10;

                if (digits.contains(Integer.toString(digit))) {
                    isDistinct = false;
                    break;
                }

                else {
                    isDistinct = true;
                }

                digits += "" + digit;
                   
            }   

            digits = "";
          
        }

        while (!isDistinct);

        System.out.println(inputYear);
    }
}
