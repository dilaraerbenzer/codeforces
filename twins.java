package codeforces;
import java.util.Scanner;

public class twins {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numberOfCoins = inp.nextInt();
        int sum = 0;
        int mySum = 0;
        int[] coins = new int[numberOfCoins];

                
        for (int i = 0; i < numberOfCoins; i++) {
            coins[i] = inp.nextInt();
            sum += coins[i];
        }

        for (int j = 0; j < numberOfCoins; j++) {

            for (int i = 1; i < numberOfCoins; i++) {
            
                if (coins[i - 1] < coins[i]) {
                int temp = coins[i - 1];
                coins[i - 1] = coins[i];
                coins[i] = temp;
                }

            }
        }
        


        int count = 0;
        int index  = 0;

        while (mySum <= sum && index < numberOfCoins) {

            coins[0] = coins[index];
            mySum += coins[0];
            sum -= coins[0];
            count++;
            index++;

        }

        System.out.println(count);


    }
}
