/*
    Array List
*/
package ArrayLista;
import java.util.ArrayList;

public class ListaCores {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();
        cores.add("Branco");
        cores.add("Cinza");
        cores.add("Preto");
        cores.add("Vermelho");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Laranja");
        
        //Impressão do ArrayList
        System.out.println("O ArrayList é: " + cores);
        System.out.println("*****************");
        
        //Consultando um índice
        System.out.println("O índice 4 contém " + cores.get(4));
        System.out.println("O comprimento do ArrayList é: " + cores.size() );
        System.out.println("*****************");
        
        //mudar o elemento do índice
        cores.set(4, "Roxo");
        System.out.println("O índice 4 contém agora: " + cores.get(4));
        System.out.println(cores);
        System.out.println("*****************");
        
        //método size() verifica o tamanho do ArrayList
        System.out.println("O comprimento do ArrayList é: " + cores.size() );
        System.out.println("*****************");
        
        //removendo um índice
        System.out.println("Removendo o índice 1: " + cores.remove(1));
        System.out.println("O ArrayList é: " + cores);
        System.out.println("O comprimento do ArrayList é: " + cores.size() );
        System.out.println("*****************");
        
        
        //limpando o índice inteiro
        cores.clear();
        System.out.println("O arra" + cores);
        
        
        
    }
    
}
