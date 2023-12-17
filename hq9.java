import java.util.*;

public class hq9 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String input = inp.next();

        if (input.contains("H") || input.contains("Q") || input.contains("9") && (!input.contains("+") || !input.contains("="))) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
