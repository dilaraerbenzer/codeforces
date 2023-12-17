import java.util.*;

public class expression {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = inp.nextInt();
        }

        int result1 = numbers[0] * (numbers[1] + numbers[2]);
        int result2 = numbers[0] * numbers[1] * numbers[2];
        int result3 = (numbers[0] + numbers[1]) * numbers[2];
        int result4 = numbers[0] + numbers[1] * numbers[2];
        int result5 = numbers[0] + numbers[1] + numbers[2];
        int result6 = numbers[0] * numbers[1] + numbers[2];
        
        int answer = Math.max(result1, Math.max(result2, Math.max(result3, Math.max(result4, Math.max(result5, result6)))));
        System.out.println(answer);
    }
}
