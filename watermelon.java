package codeforces;

import java.net.SocketImpl;
import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
        int weightWatermelon = inp.nextInt();
        boolean isEven = false;
        int waterMelonPart = 0;

        for (int i = 0; i < weightWatermelon; i++) {
            waterMelonPart = weightWatermelon - i;

            if (waterMelonPart % 2 == 0 && i % 2 == 0 && i != 0 && waterMelonPart != 0) {
                isEven = true;
            }

        }

        if (isEven) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
