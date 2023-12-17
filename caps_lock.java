import java.util.*;


public class caps_lock {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String input = inp.next();
        char[] charInput = input.toCharArray();

        boolean isAccident = true;

        // checking for mistaken caps
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) <= 'z' && input.charAt(i) >= 'a') {
                isAccident = false;
            }
        }

        if (isAccident) {
            for(int i=0; i < charInput.length; i++) {
                if (Character.isUpperCase(charInput[i])) {
                    charInput[i] = Character.toLowerCase(charInput[i]);
                }

                else {
                    charInput[i] = Character.toUpperCase(charInput[i]);
                }
            }
        }

        for (char ch : charInput) {
            System.out.print(ch);
        }

    }
}
