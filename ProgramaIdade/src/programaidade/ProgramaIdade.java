package programaidade;

import java.util.Scanner;
/**
 * @author Edson Jr
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        System.out.print("Que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = 2015 - nasc;
        
        System.out.println("Sua idade é " + i);
        if (i>=18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de Idade");
        }
    }
    
}
