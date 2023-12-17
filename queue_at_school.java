package codeforces;
import java.util.Scanner;

public class queue_at_school {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int length = inp.nextInt();
        int moves = inp.nextInt();
        inp.nextLine(); // clearing buffer before reading strings

        String queue = inp.next();

        if (queue.contains("BG")) {

            for (int j = 0; j < moves; j++) {
                queue = queue.replace("BG", "GB");
            }

        }

            
        System.out.println(queue);

    }

}
