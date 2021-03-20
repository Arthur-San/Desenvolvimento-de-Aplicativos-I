/*  Faça um programa para ler um vetor com valor indeterminado. 
Após isto, ler mais um número qualquer, calcular e escrever quantas vezes esse 
número aparece no vetor. Sempre imprimir na tela os processos do vetor.
 */
package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    ArrayList<Integer> num = new ArrayList<>();
    
    int quantidade = 0, soma = 0, opcao, numero;
    String test;
    do
    {
        System.out.println("******** Digite o comando a executado: ******** \n"
                + "1 - Adicionar \n"
                + "2 - Consultar numero \n"
                + "3 - Sair\n");
        
        opcao = ler.nextInt();
        
        switch(opcao)
        {
            case 1:
                System.out.println("\nAdicione Um Valor no Vetor");
                numero = ler.nextInt();
                num.add(numero);
                System.out.println("\nValor " + numero + " Adicionado Com Sucesso!\n");
                break;
                
            case 2:
                System.out.println("\nCosulte Um Valor no Vetor");
                numero = ler.nextInt();
                for (int tam = 0; tam < num.size(); tam++) 
                {
                  if( num.get(tam).equals(numero)){
                    quantidade += 1;
                  }
                }
                for (int valores : num) 
                {
                soma += valores; 
                }
                System.out.println("Número de vezes que se repete: " + quantidade);
                System.out.println("Soma dos valores: " + soma);
                break;
                
            case 3:
                System.out.println("\nComando Sair Executado Com Sucesso!\n");
                break;    
                
            default:
                System.out.println("Entrada Não é Reconhecida!");
                
                
        }
        
    }while(opcao != 3);
    
  }
    

}