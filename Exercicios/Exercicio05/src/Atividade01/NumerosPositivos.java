
package Atividade01;
import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num, soma = 0;
        int contar = 0;
        
       do 
       {    
           System.out.println("------ Para parar digite um número negativo ------");
           System.out.println("Digite um número positivo");
           num = ler.nextDouble();
           
           if(num > 0){
               soma = num + soma;
               contar++;
           }           
       }while(num > 0);
       
        System.out.println("A soma é: " + soma);
        System.out.println("A quantidade de números digitados: " + contar);
        System.out.println("A média é: " + (soma / contar) );
        
        
    }
    
}
