import java.util.*;

public class hulk {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int input = inp.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0 ) {
                System.out.print("I love ");
            }

            else {
                System.out.print("I hate ");
            }

            if (i == input) {
                System.out.print("it");
            }

            else {
                System.out.print("that ");
            }
        }
    }
}
