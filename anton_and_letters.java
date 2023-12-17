import java.util.*;

public class anton_and_letters {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
        input = input.replace("{", "");
        input = input.replace("}", "");
        String[] inputs = input.split(", ");

        ArrayList<String> uniqueLetters = new ArrayList<>();

        for (int i = 0; !input.equals("") && i < inputs.length; i++) {
            if (!uniqueLetters.contains(inputs[i])) {
                uniqueLetters.add(inputs[i]);
            }
        }

        System.out.println(uniqueLetters.size());
    }
}
