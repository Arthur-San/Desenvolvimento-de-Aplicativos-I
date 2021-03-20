/*
2. Criar um programa é solicitado ao usuário que digite o valor do raio de
uma circunferência. O programa retorna o valor do diâmetro e de
1 quadrante desta circunferência.
 */
package atividades;
import java.util.Scanner;


public class RaioMain {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        double raio;
        double diametro;
        double quadrante;
        
        //ENTRADA DE DADOS
        System.out.println("Digite o valor do raio: ");
        raio = ler.nextDouble();
        
        //PROCESSAMETO DE DADOS
        diametro = raio * 2;
        quadrante = raio / 4;
                      
        
        //SAÍDA DE DADOS
        System.out.println("*********SAÍDA DE DADOS*********");
        System.out.println("O valor do Raio é: " + raio);
        System.out.println("O valor do Diâmetro é: " + diametro);
        System.out.println("O valor do Quadrante é: " + quadrante);
        
    }
    
}
