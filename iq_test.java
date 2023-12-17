import java.util.*; 

public class iq_test {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int noOfNumbers = inp.nextInt();
        int[] numbers = new int[noOfNumbers];

        for (int i = 0; i < noOfNumbers; i++) {
            numbers[i] = inp.nextInt();
        }

        int evens = 0;
        int odds = 0;

        for (int number : numbers) {
            if (number % 2 ==0) {
                evens++;
            }

            else {
                odds++;
            }
        }

        if (odds == 1) {
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % 2 != 0) {
                    System.out.println(i + 1);
                }
            }
        }
        
        if (evens == 1) {
           for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % 2 == 0) {
                    System.out.println(i + 1);
                }
            }
        }
    }
}
