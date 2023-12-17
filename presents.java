import java.util.Scanner;

public class presents {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int noOfFriends = inp.nextInt();
        int[] givers = new int[noOfFriends];
        int[] receivers = new int[noOfFriends];


        for (int i = 0; i < noOfFriends; i++) {
            givers[i] = inp.nextInt();
            int giver = givers[i];
            int receiver = i + 1;
            receivers[giver - 1] = receiver;
        }


        for (int receiver : receivers) {
            System.out.print(receiver + " ");
        }
    }
}
