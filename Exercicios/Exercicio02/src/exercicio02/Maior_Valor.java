/*
    4 - Faça um algoritmo que leia dois valores reais e exiba ao 
    final qual dos dois é o maior.
 */
package exercicio02;
import java.util.Scanner;

public class Maior_Valor {

    public static void main(String[] args) {
        int valor01, valor02;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        valor01 = ler.nextInt();
        
        System.out.println("Digite o segundo valor");
        valor02 = ler.nextInt();
        
        if(valor01 > valor02)
        {
            System.out.println("O valor " + valor01 + " é MAIOR");
        }
        else
        {
            System.out.println("O valor " + valor02 + " é MAIOR");
        }
        
        
        
    }
    
}
