import java.util.*;

public class insomnia_cure {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
		int k = inp.nextInt(), l = inp.nextInt(), m = inp.nextInt(), n = inp.nextInt(), d = inp.nextInt();
		int count = 0;

		for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                count++;
            }
        }
			
		System.out.println(count);

		inp.close();
    }
}
