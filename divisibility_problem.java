    import java.util.*;

    public class divisibility_problem {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);

            int t = inp.nextInt();
            inp.nextLine();
            int[] counts = new int[t];

            for (int i = 0; i < t; i ++) {
                
                String[] input = inp.nextLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);

                int count = (int) Math.ceil((double) a / b) * b - a;
                
                counts[i] = count;
            }

            for (int count : counts) {
                System.out.println(count);
            }
        }
    }
