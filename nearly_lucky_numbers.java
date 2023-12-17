package codeforces;
import java.util.Scanner;

public class nearly_lucky_numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        long number = inp.nextLong();
        int count = 0;

        do {
            long lastDigit = number % 10;

            if (lastDigit == 7 || lastDigit == 4) {
                count++;
            }

            number = number / 10;
        }

        while (number != 0);

        if (count == 4 || count == 7){
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }

    }
}
