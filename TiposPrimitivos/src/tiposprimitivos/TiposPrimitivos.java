/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Edson Jr
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //String nome = "Edson";
        //float nota = 8.5f;
        // Sem quebra de linha
        //System.out.print("A sua nota é "+ nota);
       
        //Com quebra de linha
        //System.out.println("A sua nota é " + nota);
        
        //Quando deseja formatar a variável utilizamos o %.xxf, o \n serve para quebrar linha
        //Se deseja escrever uma variável do tipo String, podemos utilizar da forma que segue
        //Até então estavamos escrevendo com . , para escrever o número com , pode ser utilizado o .format conforme exemplo
        //System.out.printf("A nota de %s é %.2f \n",nome, nota);
        
        //Até então estavamos escrevendo com . , para escrever o número com , pode ser utilizado o .format conforme exemplo, mesmo tratamento que o printf
        //System.out.format("A nota de %s é %.1f \n",nome, nota);
        
        //Efetuando a leitura das variaveis de entrada nome e nota
        System.out.print("Digite o nome do aluno: ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        
    }
    
}
