package codeforces;
import java.util.Scanner;

public class elephant {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int location = inp.nextInt();
        int count = 0;

        for (int i = 5; i >=1; i--) {
            count += location / i;
            location = location % i;
        }
        
        System.out.println(count);
    }
}
