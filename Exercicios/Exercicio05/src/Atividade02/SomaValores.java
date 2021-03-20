
package Atividade02;
import java.util.Scanner;
public class SomaValores {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        int num, soma = 0;
        
        
        do {
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            
            if(num > 0) {
                soma = num + soma;
            }
        }while (num > 0);
        
        System.out.println("Soma dos valores: " + soma);
        
    }
    
}
