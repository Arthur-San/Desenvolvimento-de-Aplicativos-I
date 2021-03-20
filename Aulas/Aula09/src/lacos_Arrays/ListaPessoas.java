/*
Classificar um arraylist por nome
usando o pacote colletion com método sort
 */
package lacos_Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ListaPessoas {

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Marcela");
        alunos.add("Ana");
        alunos.add("Beto");
        alunos.add("Tonho");
        alunos.add("Zé");
        alunos.add("Josefa");
        System.out.println("A lista de alunos é: " + alunos);
        
        
        Collections.sort(alunos);
        System.out.println("A lista de alunos é: " + alunos);
        System.out.println("O Array List possúi: " + alunos.size() + " Elementos" );
        System.out.println("O índice 04 possúi o elemento: " + alunos.get(4) );
        
        
        
    }
    
}
