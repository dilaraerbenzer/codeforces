package codeforces;
import java.util.Scanner;

public class chat_room {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String s = inp.next();
        String hello = "";
        int count = 0;

        do {
            
            if (s.charAt(0) == 'h' ) {
                hello = "h";
                s = s.replaceAll("h", "");
            }


            else if (hello.equals("h") && s.charAt(0) == 'e') {
                hello += "e";
                s = s.replaceAll("e", "");
            }

            
            else if (hello.equals("he") || hello.equals("hel") && s.charAt(0) == 'l' && count <= 2) {
                    hello += "l";
                    s = s.replaceFirst("l", "");
                    count++;
            }

                
            else if (hello.equals("hell") && s.charAt(0) == 'o') {
                hello += "o";
                s = s.replaceAll("o", "");
            }

            else { // no matching, character removed
                s = s.substring(1);
            }

        }

        while (s.length() > 0); // continues until no more characters are left in the original string 

        // checking if the "hello" is valid

        if (hello.equals("hello")) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
