package codeforces;
import java.util.Scanner;

public class stones_on_table {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numberOfStones = inp.nextInt();
        inp.nextLine();
        String stones = inp.next();
        int count = 0;

        for (int i = 0; i < numberOfStones - 1; i++) {
            
            if (stones.charAt(i) == stones.charAt(i+1)) {
                count++;
            }
        }

        System.out.println(count);


    }
}
