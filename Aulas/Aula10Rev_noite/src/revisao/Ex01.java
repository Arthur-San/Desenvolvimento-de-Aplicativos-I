
package revisao;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        int num = 0;
        
        System.out.println("*************************");
        System.out.println("Lista de Números Digitados: \n");
        
        
        System.out.println("---- Digite a Quantidade de números desejdos e para parar o programa, basta digitar zero! ----");
        
        
        /*
        1º parde do programa - número digitado
        ordem qe o programa FAÇA o
        - digitar numero
        - gravar numero
        -adicionar o numero no ArrayList
        ENQUANTO o numero for maior que ZERO
        */
        do
        {
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            //adiciona o elemento no ArrayList
            lista.add(num);
        }while(num > 0);
        
        //remove o número digitado que não confere com os números positivos
        //ou seja, o zero e número negativo não será listado no ArrayList
        int ultimo = lista.size();
        lista.remove(ultimo - 1 );
        System.out.println("Minha lista: " + lista);
        
        //2º parte do programa - a soma dos números digitados
        //foreach que significa PARA CADA número digitado ele soma estes valores
        //foreach (:) que significa "para cada"
        int soma = 0;
        for(int numero : lista)
        {
            soma += numero;
        }
        
        //3º parte do programa - quantidade e média 
        System.out.println("A SOMA dos números digitados é: " + soma);
        System.out.println("A QUANTIDADE dos números digitados é: " + lista.size() );
        System.out.println("A MÉDIA dos números digitados é: " + (soma / lista.size() ));
        
    }
    
}
