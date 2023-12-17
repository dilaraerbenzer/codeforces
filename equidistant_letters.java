package codeforces;
import java.util.Scanner;

public class equidistant_letters {
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);  
        int numberOfInputs = inp.nextInt();
        String[] strings = new String[numberOfInputs];
        String sameChars = "";
        String reducedString1 = "";

        for (int i = 0; i < numberOfInputs; i++) {

            strings[i] = inp.next();
        }

        for (int i = 0; i < numberOfInputs; i++) {

            for (int j = 0; j < strings[i].length(); j++) {
                
                reducedString1 = strings[i].substring(0, j);

                if (reducedString1.contains(strings[i].substring(j, j+1))) 
                {
                    char currentChar = strings[i].charAt(j);
                    sameChars += "" + currentChar;
                }
                
            }

            for (int j = 0; j < sameChars.length(); j++) {
                strings[i] = strings[i].replace(sameChars.substring(j, j+1), "");
            }   

            System.out.println(strings[i] + sameChars + sameChars);
            sameChars = "";

        }
    }       


}

