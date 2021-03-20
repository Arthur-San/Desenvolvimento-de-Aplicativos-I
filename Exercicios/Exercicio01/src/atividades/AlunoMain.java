/*
1. Criar um programa onde é solicitado a digitação do nome do aluno mais 3 notas.
O programa deverá retornar o nome e clacular a média aritmética deste aluno.
nota1 + nota2 + nota 3 / 3.
 */
package atividades;
import java.util.Scanner;

public class AlunoMain {
    static Scanner ler = new Scanner(System.in);
        String nome;
        double nota01;
        double nota02;
        double nota03;
    
        
    public static void main(String[] args) {
        
        //ENTRADA DE DADOS
        System.out.println("Qual o seu nome? ");
        String nome = ler.nextLine();
        
        System.out.println("Qual é a primeira nota? ");
        double nota01 = ler.nextDouble();
        
        System.out.println("Qual é a segunda nota?");
        double nota02 = ler.nextDouble();
        
        System.out.println("Qual é a terceira nota?");
        double nota03 = ler.nextDouble();
        
        //PROCESSAMENTO DE DADOS
        double mediaAritimetica = (nota01 + nota02 + nota03) / 3;
        
        
        //SAÍDA DE DADOS
        System.out.println("******SAÍDA DE DADOS******");
        System.out.println("Nome: " + nome);
        System.out.println("Média Aritimética: " + mediaAritimetica);
        
        
    }
    
}
