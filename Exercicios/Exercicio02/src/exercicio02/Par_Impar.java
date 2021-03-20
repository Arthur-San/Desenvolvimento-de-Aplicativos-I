/*
    3 - Faça um algoritmo que leia um valor inteiro e retorne se este 
    valor é PAR ou ÍMPAR.
 */
package exercicio02;
import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        int valor;        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o valor");
        valor = ler.nextInt();
        
        if(valor % 2 == 0)
        {
            System.out.println("O valor é PAR");
        }
        else
        {
            System.out.println("O valor é ÍMPAR");
        }
    }
    
}
