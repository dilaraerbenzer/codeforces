import java.util.*;

public class hit_the_lottery {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int input = inp.nextInt();
        int count = 0;

        while (input >= 100) {
            input -= 100;
            count++;
        }

        while (input >= 20) {
            input -= 20;
            count++;
        }

        while (input >= 10) {
            input -= 10;
            count++;
        }

        while (input >= 5) {
            input -= 5;
            count++;
        }

        while (input >= 1) {
            input -= 1;
            count++;
        }

        System.out.println(count);
    }
    
}
