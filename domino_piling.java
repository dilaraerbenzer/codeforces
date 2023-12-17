import java.util.Scanner;

public class domino_piling {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt();
        int n = inp.nextInt();
        int numberOfDominoes = 0;
        int uwu = 0;
        int owo = 0;

        uwu = m / 2 * n;
        owo = m % 2 * n / 2;

        numberOfDominoes = uwu + owo;

        System.out.println(numberOfDominoes);
    }
}
