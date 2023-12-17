import java.util.*;

public class dubstep {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String input = inp.next();

        input = input.replaceAll("WUB", " ");
        input = input.trim();
        System.out.println(input);

    }
}
