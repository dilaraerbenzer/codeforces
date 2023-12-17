import java.util.*;

public class anton_and_polyhedrons {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int noOfShapes = inp.nextInt();
        inp.nextLine();
        String[] shapes = new String[noOfShapes];
        int facets = 0;

        for (int i = 0; i < noOfShapes; i++) {
            shapes[i] = inp.next();
        }

        for (int i = 0; i < noOfShapes; i++) {
            if (shapes[i].equals("Tetrahedron"))  {
                facets += 4;
            }

            else if (shapes[i].equals("Cube")) {
                facets += 6;
            }

            else if (shapes[i].equals("Octahedron")) {
                facets += 8;
            }

            else if (shapes[i].equals("Dodecahedron")) {
                facets += 12;
            }

            else {
                facets += 20;
            }
        }

        System.out.println(facets);
    }
}
