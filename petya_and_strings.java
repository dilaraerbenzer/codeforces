package codeforces;
import java.util.Scanner;

public class petya_and_strings {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String string1 = inp.next();
        String string2 =inp.next();

        if (string1.compareToIgnoreCase(string2) > 0) {
            System.out.println("1");
        }

        else if (string1.compareToIgnoreCase(string2) < 0) {
            System.out.println("-1");
        }

        else {
            System.out.println("0");
        }
    } 
}
