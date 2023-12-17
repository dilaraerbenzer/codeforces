import java.util.Scanner;
import java.math.BigInteger;


public class even_odds {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        BigInteger n = inp.nextBigInteger();
        BigInteger k = inp.nextBigInteger();

        BigInteger noOfOdd = (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) ? n.divide(BigInteger.valueOf(2)) : n.add(BigInteger.ONE).divide(BigInteger.valueOf(2));

        BigInteger result;

        if (k.compareTo(noOfOdd) > 0) { // even numbers
            result = BigInteger.valueOf(2).add(k.subtract(noOfOdd).subtract(BigInteger.ONE).multiply(BigInteger.valueOf(2)));
        } else { // odd numbers
            result = BigInteger.ONE.add(k.subtract(BigInteger.ONE).multiply(BigInteger.valueOf(2)));
        }

        System.out.println(result);
    }
}
