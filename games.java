import java.util.*;

public class games {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int noOfTeams = inp.nextInt();
        int[][] teams = new int[noOfTeams][2];

        for (int i = 0; i < noOfTeams; i++) {
            for (int j = 0; j < 2; j++) {
                teams[i][j] = inp.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < noOfTeams; i++) {
            for (int j = i + 1; j < noOfTeams; j++) {

                if (teams[i][0] == teams[j][1]) {
                    count++;
                }

                if (teams[i][1] == teams[j][0]) {
                    count++;
                }
                
            }
        }

        System.out.println(count);
            
    }
}
