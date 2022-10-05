package testefuncao01;

/**
 * @author Edson Jr
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    //Procedimento não retorna valores
    /*static void soma(int a, int b){
        int s = a + b ;
        System.out.println("A soma é " + s);
    }*/
    //Função que retorna valores
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");                                                                                                                                       
        int sm = soma(5,2);
        System.out.println("A soma é " + sm);
    }
    
}
