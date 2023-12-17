import java.util.Scanner;

public class drinks {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int noOfDrinks = inp.nextInt();
        int[] orangePercentage = new int[noOfDrinks];
        double result;
        double sum = 0;

        for (int i = 0; i < noOfDrinks; i++) {
            orangePercentage[i] = inp.nextInt();
            sum += orangePercentage[i];
        }

        result = sum / noOfDrinks;
        System.out.println(result);
    }
}
