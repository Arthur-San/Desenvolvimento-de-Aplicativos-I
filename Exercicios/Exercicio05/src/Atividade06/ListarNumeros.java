/*
6. Criar um programa em Java que consistem em:
- Listar números de 1 a 50;
- Exibir a lista na horizontal e vertical;
- Exibir o tamanho da lista;
- Somar os valores da lista;
 */
package Atividade06;
import java.util.ArrayList;

public class ListarNumeros {

    public static void main(String[] args) {
        int soma = 0, contar = 0;

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        //exibindo números na horizontal
        do{
            if(soma < 50){
            soma += 1;
            numeros.add(soma);
            }
        }while(soma < 50);        
        System.out.println("Números na horizontal: \n" + numeros + "\n");
        
        
        
        //exibindo números na vertical
        System.out.println("Números na vertical: ");
        for(int i = 0; i < 50; i++)
        {
            System.out.println(numeros.get(i) );
        }
        
        
        
        //Exibindo o tamanho da lista
        System.out.println("O tamanho da lista é: " + numeros.size());
        
        
        
        //Somando os valores da lista
        for (int n = 0; n < numeros.size(); n++) {
            contar = contar + numeros.get(n);
        }
        System.out.println("A soma dos números é: " + contar);
        
        
        
        
    }

}
