package codeforces;
import java.util.Scanner;

public class soldier_and_bananas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = inp.nextInt();
        }

        int costBanana = numbers[0];
        int money = numbers[1];
        int numberOfBananas = numbers[2];
        int required = 0;

        for (int i = 1; i <= numberOfBananas; i++) {
            required += costBanana * i;
        }

        int loan = 0;

        if (required > money) {
            loan = required - money;
        }
       
        System.out.println(loan);
    }
}
