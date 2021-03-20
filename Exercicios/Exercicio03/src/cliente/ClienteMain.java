package cliente;
import java.util.Scanner;

public class ClienteMain {
    public static void main(String[] args) {        
        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente();
        
        //set - setando os valores (gravando os valores)
        System.out.println("Digite o seu nome? ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Qual a sua idade? ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Qual a sua renda? ");
        c1.setRenda(ler.nextDouble());
        
        //get - exibindo os valores
        System.out.println("********Exibindo resultados********");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade() + " anos" +" / " + c1.classificarIdade() );
        System.out.println("Renda: R$" + c1.getRenda() + " / " + c1.classificarRenda() );
        
    }
    
}
