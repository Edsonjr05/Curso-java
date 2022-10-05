package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Edson Jr
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Exemplo de janela que vem previamente criada com a javax.swing.JOptionPane
        //JOptionPane.showMessageDialog(null,"Olá! Mundo!","Boas Vindas", JOptionPane.ERROR_MESSAGE);
        
        //Esta mesma janela pode receber um valor digitado pelo usuário e escrever em uma nova janela
        //int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
        //JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
        
        
        int n,s=0,valores=-1,media=0;
        int par=0,impar=0,maiorquecem=0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um número: <br><em>(Valor 0 interrompe)<em></html>"));
        s += n;
        valores++;
            if ( n == 0 ){
                break;
            }else{
                if ( n % 2 == 0){
                    ++par;
                }else{
                    ++impar;
                }
                
                if ( n > 100 ){
                    maiorquecem++;
                }
            }
        }while (n != 0);
        
        media = s / valores;
        
        JOptionPane.showMessageDialog(null,"<html>Resultado final <br><hr>" +
                "<br>Total de valores: " + valores +
                "<br>Total de pares: " + par +
                "<br>Total de ímpares: " + impar +
                "<br>Acima de 100: " + maiorquecem +
                "<br>Média dos valores: " + media + "</html>");
    }
    
}
