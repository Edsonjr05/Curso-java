package numeros;

import java.util.Scanner;

/**
 * @author Edson Jr
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n; // s = s + n;
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();              
        } while (resp.equals("S"));
        
        System.out.println("A soma de todos os valores é " + s);
        
    }
    
}
