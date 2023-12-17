package codeforces;
import java.util.Scanner;
public class taxi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numberOfGroups = inp.nextInt();
        int[] numberOfKids = new int[numberOfGroups];
        int[] groupCount = new int[5];
        int taxi = 0;


        for (int i = 0; i < numberOfGroups; i++) { // getting input for number of kids in each group
            numberOfKids[i] = inp.nextInt();
            groupCount[numberOfKids[i]]++; // group count based on index 1-4 increased each time
        }

        taxi += groupCount[4]; // increasing as many as 4-sized groups

        if (groupCount[1] != 0 && groupCount[3] !=0) {
            do {
                taxi ++;
                groupCount[3]--;
                groupCount[1]--;
            }
            while (groupCount[1] != 0 && groupCount[3] !=0);
        }

        taxi += groupCount[3];

        if (groupCount[2] != 0 && groupCount[1] != 0) {
            do {
                taxi ++;

                if (groupCount[1] > 1) {
                    groupCount[1] -= 2;
                }
                else if (groupCount[1] == 1) {
                    groupCount[1] --;
                }

                groupCount[2]--;
            }
            while (groupCount[2] != 0 && groupCount[1] != 0);
        }
                

        while (groupCount[2] != 0) {

            if (groupCount[2] >= 2) {
                taxi = taxi + groupCount[2] / 2;
                groupCount[2] = groupCount[2] % 2;
            }

            else {
                groupCount[2]--;
                taxi++;
            }
        }

        if (groupCount[1] >= 4) {
            taxi = taxi + groupCount[1] / 4;
            groupCount[1] = groupCount[1] % 4;
        }

        if (groupCount[1] > 0) {
            taxi++;
            groupCount[1] = 0;
        }

        System.out.println(taxi);
    }
}
