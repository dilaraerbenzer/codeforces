import java.util.Scanner;

public class calculating_function {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long length = inp.nextLong();
        long result = 0;

        long noOfOdd = (length % 2 == 0) ? length / 2 : (length + 1) / 2;
        long noOfEven = length - noOfOdd;

        // odd
        result -= noOfOdd * noOfOdd;

        // even
        result += noOfEven  * (noOfEven + 1);
        System.out.println(result);
    }
}
