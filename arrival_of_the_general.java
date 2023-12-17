import java.util.*;

public class arrival_of_the_general {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int noOfSoldiers = inp.nextInt();
        int[] heights = new int[noOfSoldiers];


        for (int i = 0; i < noOfSoldiers; i++) {
            heights[i] = inp.nextInt();
        }

        int count = 0;

        int maxHeight = Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                max = i;
            }
        }

        for (int i = max; i > 0; i--) {

            if (heights[0] == maxHeight) {
                break;
            }

            int temp = heights[i - 1];
            heights[i - 1] = heights[i];
            heights[i] = temp;
            count++;
            
        }


        int minHeight = Integer.MAX_VALUE;
        int min = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] <= minHeight) {
                minHeight = heights[i];
                min = i;
            }
        }

        for (int i = min; i < noOfSoldiers - 1; i++) {

            if (heights[noOfSoldiers - 1] == minHeight) {
                break;
            }

            int temp = heights[i + 1];
            heights[i - 1] = heights[i];
            heights[i] = temp;
            count++;

        }

        System.out.println(count);
        
    }
}