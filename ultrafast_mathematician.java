import java.util.Scanner;

public class ultrafast_mathematician {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        String n1 = inp.next();
        String n2 = inp.next();
        String result = "";

        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != n2.charAt(i)) {
                result += 1;
            }

            else {
                result += 0;
            }
        }

        System.out.println(result);

        
    }
}
