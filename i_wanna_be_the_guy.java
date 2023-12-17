import java.util.*;

public class i_wanna_be_the_guy {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int finalLevel = inp.nextInt();
        
        int x = inp.nextInt();
        int[] listX = new int[x];
        for (int i = 0; i < x; i++) {
            listX[i] = inp.nextInt();
        }
        int y = inp.nextInt();
        int[] listY = new int[y];
        for (int i = 0; i < y; i++) {
            listY[i] = inp.nextInt();
        }

        ArrayList<Integer> passableLevels = new ArrayList<>();

        
        for (int i = 0; i < listX.length; i++) {
            addUnique(passableLevels, listX[i]);
        }     
        
        for (int i = 0; i < listY.length; i++) {
            addUnique(passableLevels, (listY[i]));
        }

        if(passableLevels.size() == finalLevel) {
            System.out.println("I become the guy.");
        }

        else {
            System.out.println("Oh, my keyboard!");
        }
    }

    private static void addUnique(ArrayList<Integer> list, int number) {
        // Check if the number is not already in the list
        if (!list.contains(number) && number != 0) {
            // Add the number to the list
            list.add(number);
        }

    }
}
