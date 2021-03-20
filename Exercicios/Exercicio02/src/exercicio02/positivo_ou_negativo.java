/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;
import java.util.Scanner;

public class positivo_ou_negativo {

    public static void main(String[] args) 
    {        
        int valor;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor");
        valor = ler.nextInt();
              
        
        if(valor >= 0 )
        {
            System.out.println("O valor " + valor + " é POSITIVO");
        }
        else
        {
            System.out.println("O valor " + valor + " é NEGATIVO");
        }
    }
    
}
