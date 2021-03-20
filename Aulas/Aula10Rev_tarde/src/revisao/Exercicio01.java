/*
    a soma dos números digitados
    a quantidade de números digitados
    a média dos números digitados
*/
package revisao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> listaNumDigitados = new ArrayList<>();
        
        System.out.println("Digite a quantidade de números desejados: ");
        System.out.println("Para finalizar o seu programa, digite um número negativo: ");
        
        int num = 0;
        
        //laço e repetição do/while
        //faça o seguinte:
        //Digite o número.... leia o número e adicione o número
        //ENQUANTO o número for MAIOR que zero
        do{
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            listaNumDigitados.add(num);
        }while(num > 0 );
        {
            //esta variável serve para excluir o número negativo que foi digitado
            //e parou a execução do programa
            int ultimoNum = listaNumDigitados.size();
            listaNumDigitados.remove(ultimoNum - 1 );
            
            System.out.println("Esta é a lista de números digitados: " + listaNumDigitados);
            int somaNum = 0;
            //para cada (for) numero (int n) ele vai somar estes números
            //for(var : ArrayList){} (for each) --- para cada 
            for(int n : listaNumDigitados){
                somaNum += n;
            }
            
            //média dos números digitados
            int mediaNum = 0;
            mediaNum = somaNum / listaNumDigitados.size();            
            
            System.out.println("A soma dos números digitados é: " + somaNum);
            System.out.println("A quantidade de números digitados é: " + listaNumDigitados.size() );
            System.out.println("A média dos números digitados é: " + mediaNum);
            
            
        }
        
        
    }
    
}
