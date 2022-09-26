/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Edson Jr
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
         *int n2 = 5;
         *float m = (n1 + n2) /2;
         *System.out.println("A média é igual a " + m);
         */
        
        /*int numero = 5;
         *int valor = 5 + numero++;
         *System.out.println(valor);
         *System.out.println(numero);
         */
        
      /*int x =4;
      *x *=2; //x = x + 2
      *System.out.println(x);
      */
      
      float v = 8.5f;
      //Arrendonda para baixo
      //int ar = (int) Math.floor(v);
      
      //Arredonda para cima
      //int ar = (int) Math.ceil(v);
      
      //Arredonda da forma "normal"
      //int ar = (int) Math.round(v);
      //System.out.println(ar);
      
      //Gera números aleatórios de 0 a 1
      //double ale = Math.random();
      //System.out.println(ale);
      
      //Para conseguirmos utilizar números randômicos conforme uma faixa de números, é necessário utilizar o macete que segue:
      double ale = Math.random();
      int n = (int) (5 + ale * (10-5));
      System.out.println(n);
              
             
    }
    
}
