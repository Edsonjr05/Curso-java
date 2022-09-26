package comparacaostring;

/**
 *
 * @author Edson Jr
 */
public class ComparacaoString {

    public static void main(String[] args) {
        
        String nome1 = "Edson";
        String nome2 = "Edson";
        String nome3 = new String("Edson");
        String res;
        
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
                
       
    }
    
}
