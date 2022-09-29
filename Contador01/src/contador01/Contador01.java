
package contador01;

/**
 * @author Edson Jr
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cc = 0;
        while (cc <10){
            cc++;
            /*if ( cc == 5 || cc == 7 || cc == 9 ){
                // Altera o fluxo da repetição, faz com que não execute nada após ele e volte ao "inicio" do loop, neste caso não irá listar as cambalhotas 5/7/9 pois não irá executar o sout.
                continue;
            }*/
            if ( cc == 2 || cc == 3 || cc ==4){
                continue;
            }
            if ( cc == 7 ){
                break;
            }
            System.out.println("Cambalhota " + cc);
            
        }
    }
    
}
