package vetor02;

import java.util.Calendar;

/**
 * @author Edson Jr
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //Descobrir se o ano atual é bisexto ou não;
        Calendar year = Calendar.getInstance();
        int ano = year.get(Calendar.YEAR);
        
        if ( ano % 4 == 0 ){
            tot[1]=29;
            System.out.println("É bisexto");
        }else{
            tot[1]=28;
            System.out.println("Não é bisexto");
        }
        
        for (int c = 0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo");
        }
    }    
}
