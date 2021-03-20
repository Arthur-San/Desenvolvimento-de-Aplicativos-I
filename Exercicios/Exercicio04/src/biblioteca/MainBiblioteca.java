
package biblioteca;
import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {
        //INSTANCIAMENTO DE CLASSES
        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente();
        Livro l1 = new Livro();
        
        //ENTRADA DE DADOS - SET
        System.out.println("*******INFORMAÇÕES DO CLIENTE*******");
        System.out.println("Digite seu nome: ");
        c1.nome = ler.nextLine();
        
        System.out.println("Digite sua idade: (desconto de 20% p/ >=60 anos)");
        c1.idade = ler.nextInt();
        
        System.out.println("Digite seu Telefone: ");
        c1.setTelefone(ler.nextInt());
        
        System.out.println("Digite seu CPF: ");
        c1.setCpf(ler.next());
        
        System.out.println("Digite o Preço do Livro: ");
        c1.setPreco(ler.nextDouble());
        
        System.out.println("*******INFORMAÇÕES DO LIVRO*******");
        System.out.println("Digite o título: ");
        l1.titulo = ler.next();
        
        System.out.println("Digite o autor: ");
        l1.autor = ler.next();
        
        System.out.println("Digite o ano de publicação: ");
        l1.ano = ler.nextInt();
        
        System.out.println("O aluguel é: R$" + l1.getAluguel());
        System.out.println("Digite a quantidade de dias a ser alugado: ");
        l1.setData(ler.nextInt());        
        
        

        //SAÍDA DE DADOS - 
        System.out.println(c1);
        System.out.println(l1);
        System.out.println("**************TOTAL**************");
        System.out.println("Livro A vista: R$" + (c1.getPreco() - c1.verificarDesconto()) );
        System.out.println("Total do Aluguel: " + ("R$" + (l1.getAluguel() * l1.getData() ) ) );
        
        
        
        
        
        
        
    }
    
}
