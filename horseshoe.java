import java.util.Scanner;
import java.util.ArrayList;

public class horseshoe {    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] inputs = new int[4];

        for (int i = 0; i < 4; i++) {
            inputs[i] = inp.nextInt();
        }

        ArrayList<Integer> horseShoes = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            Integer currentShoe = inputs[i];

            horseShoes.add(currentShoe);

            for (int j = i + 1; j < 4; j++){
                if (inputs[i] == inputs[j]) {
                    horseShoes.remove(currentShoe);
                }
            }
            
        }

        System.out.println( 4 - horseShoes.size());
    }
}
