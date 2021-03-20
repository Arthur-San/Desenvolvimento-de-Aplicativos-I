
package teste;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();
        int indice;
        
        //insere um elemento no ArrayList
        cores.add("Azul");
        cores.add("Preto");
        cores.add("Rosa");
        cores.add("Vermelho");
        
        //impressão do arraylist
        System.out.println(cores);
        
        
        //Verificar se a lista está vazia
        System.out.println(cores.isEmpty());
        
        
        //Exibe o comprimento do ArrayList
        System.out.println(cores.size() );
        
        
        //Retornar o elemento no índice especificado
        System.out.println("Digite o índice desejado");
        //criando uma variável para o método get ler o valor inserido pelo usuário
        indice = ler.nextInt();
        System.out.println(cores.get(indice));
        
        
        
    }
    
}
