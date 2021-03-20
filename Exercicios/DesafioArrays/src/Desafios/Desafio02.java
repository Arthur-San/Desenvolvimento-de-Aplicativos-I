/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafios;
import java.util.ArrayList;

public class Desafio02 {

   
    public static void main(String[] args) {
        //declarando o vetor
        ArrayList <Integer> numeros = new ArrayList(); 
        
        //atributos
        int pares = 0, impares = 0;
        
        //laço de repetição 
        for(int i = 0; i < 20; i++){            
            numeros.add(i + 1);
            
                //calculo para números divididos por 2 
                //com resto da divisão igual a zero - PARES
                if(numeros.get(i) % 2 == 0){
                    pares++;
                
                //calculo para números divididos por 2 
                //com resto da divisão diferente de zero - ÍMPARES
                }else if(numeros.get(i) % 2 != 0){
                    impares++;
                }
                
                //erro por o usuário adicionar números com decimais
                else{
                    System.out.println("Digite Somente Números Inteiros!");
                }    
        }
        
        System.out.println("Os numeros digitados: \n" + numeros);
        System.out.println("\nNúmeros Pares: " + pares);
        System.out.println("Números Ímpares: " + impares);
    }
    
}
