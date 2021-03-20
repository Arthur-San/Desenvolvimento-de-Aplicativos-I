/*
3. Faça um programa que leia uma variável real "A" digitada pelo usuário
e apresente o resultado dos seguintes cálculos:
- o dobro de "A"
- o triplo do dobro de "A"
- a metade do triplo do dobro de "A"
- o quadrado da variável "A"
- a quinta parte do dobro de "A"
 */
package atividades;
import java.util.Scanner;

public class CalculosMain {
    public static void main(String[] args) {
        //INSTANCIANDO A VARIÁVEL "ler" PARA RECEBER OS ATRIBUTOS DA CLASSE SCANNER
        Scanner ler = new Scanner(System.in);
        
        //DECLARAÇÃO DA VARIÁVEL
        double A;
        
        
        //LER OS VALORES INSERIDOS
        System.out.println("Digite o valor de A");
        A = ler.nextDouble();
        
        //PROCESSAMENTO DE DADOS COM SAÍDA DE DADOS
        System.out.println("*******SAÍDA DE DADOS*******");
        System.out.println("o dobro de 'A': " + (A*2) );
        System.out.println("o triplo do dobro de 'A': "+ ((A*2)*3) );
        System.out.println("a metade do triplo do dobro de 'A': " + (((A*2)*3)/2) );
        System.out.println("o quadrado da variável 'A': " + (A*A) );
        System.out.println("a quinta parte do dobro de 'A': " + (A/5));
        
        
    }
    
}
