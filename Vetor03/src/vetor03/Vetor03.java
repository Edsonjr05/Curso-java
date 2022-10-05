package vetor03;

import java.util.Arrays;

/**
 * @author Edson Jr
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[]={ 3.5, 2.75 , 9 , -4.5};
        //Ordenando o array, utilizar o Arrays.sort()
        Arrays.sort(v);
        //For Each
        for (double valor: v){
            System.out.print(valor + " ");
        }
    }
    
}
