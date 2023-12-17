package codeforces;
import java.util.Scanner;

public class beautiful_year_without_break {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int inputYear = inp.nextInt();

        boolean isDistinct;
        int year = 0;
        String digits = "";

        do {
            
            isDistinct = true;

            inputYear++;

            year = inputYear;

            while (year != 0 && isDistinct) {
                
                int digit = year % 10;
                year = year / 10;
                

                if (digits.contains(Integer.toString(digit))) {
                    isDistinct = false;
                }

                digits += "" + digit;

            }   

            digits = "";
          
        }

        while (!isDistinct);

        System.out.println(inputYear);
    }
}
