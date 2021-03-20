//ARRAY
package Arrayss;
//declaração da importação da classe Array
import java.util.Arrays;

public class NumerosPares {

    public static void main(String[] args) {
        //Declaração do array com valores atribuídos
        //nome do array -- pares
        //comprimento do array é 12
        //índice é 11
        
        //Array com números - int
        int [] pares = {2,4,6,8,10,12,14,16,18,20,22,24};
        
        //Array com texto - String
        String [] nomes = {"Ana", "Bia", "Carlos", "José"};
        
        System.out.println("Estes São Os Números Pares Do Array");
        for(int i = 0; i < 12; i++){
            System.out.println(pares[i]);
        }
        
        //Usando o método toString para exibir os valores do Array como Array
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(nomes));
        
        //Atributo length exibe o comprimento do Array
        System.out.println("O Array contém " + pares.length + " elementos");
        System.out.println("O Array contém " + nomes.length + " elementos");
    }
    
}
