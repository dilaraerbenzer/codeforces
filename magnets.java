
import java.util.Scanner;

public class magnets {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numberOfMagnets = inp.nextInt();
        int[] magnets = new int[numberOfMagnets];
        int groups = 1;

        for (int i = 0; i < numberOfMagnets; i++) {
            magnets[i] = inp.nextInt();
        }

        for (int i = 1; i < numberOfMagnets; i++) {
            if (magnets[i - 1] != magnets[i]) {
                groups++;
            }
        }

        System.out.println(groups);

    }
}
