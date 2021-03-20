/*
    2 - Faça um algoritmo que leia dois valores reais e informe se estes 
    valores são iguais ou diferentes.
 */
package exercicio02;
import java.util.Scanner;

public class Igual_ou_Diferente {
    static Scanner ler = new Scanner(System.in);
    double valor01, valor02;
    
    public static void main(String[] args) {
        System.out.println("Informe o primeiro valor");
        double valor01 = ler.nextDouble();
        
        System.out.println("Informe o segundo valor");
        double valor02 = ler.nextDouble();
        
        if(valor01 == valor02)
        {
            System.out.println("Os valores são IGUAIS");
        }
        else
        {
            System.out.println("Os valores são DIFERENTES");
        }
    }
    
}
