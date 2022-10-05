package vetor04;

import java.util.Arrays;

/**
 * @author Edson Jr
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[]={3, 7, 6, 1, 9, 1, 4, 2};
        for (int v:vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet,1);
        System.out.println("Encontrei o valor na posição " + p);
    }
    
}
