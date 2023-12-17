import java.util.*;

public class kefa_and_first_steps {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = inp.nextInt();
        }

        int max = 0;
        int prevNumber = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int nextNumber = sequence[i];

            if (nextNumber >= prevNumber) {
                count++;
            }

            else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }

            prevNumber = nextNumber;

        }

        System.out.println(max);
    }
}
