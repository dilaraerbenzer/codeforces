package codeforces;
import java.util.Scanner;

public class anton_and_danik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numberOfGames = inp.nextInt();
        String games = inp.next();
        int anton = 0;
        int danik = 0;

        for (int i = 0; i < numberOfGames; i++) {
            if (games.charAt(i) == 'A') {
                anton++;
            }

            else {
                danik++;
            }

        }

        if ( anton > danik) {
            System.out.println("Anton");
        }

        else if ( danik > anton) {
            System.out.println("Danik");
        }

        else {
            System.out.println("Friendship");
        }
    }
}
