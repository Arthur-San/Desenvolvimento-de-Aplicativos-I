
package Ex05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Produto p1 =  new Produto();
        
        
        System.out.println("Digite o nome do produto: ");
        p1.setNome(ler.nextLine());
        
        System.out.println("Digite o valor do produto: ");
        p1.setValor(ler.nextDouble());
        
        System.out.println("Produto: " + p1.getNome());
        System.out.println("valor: " + p1.getValor());
        System.out.println("Desconto: " + p1.calcularDesconto());
    }
    
}
