/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;
import java.util.Scanner;
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        
        //atributos
        int meiaVida = 0;
        double gramas = 0;
        double segundos = 0, minutos = 0, horas = 0;
        
        System.out.println("Digite o valor da massa inicial do material: ");
        gramas = ler.nextDouble();
        
        //ENQUANTO a variável gramas for maior que 0.5
        //o programa pega o valor de gramas e divide pela metade e
        //incrementa a variável meiaVida
        while(gramas > 0.5){
            gramas /= 2;
            meiaVida ++;
        }
        
        segundos = meiaVida * 50;
        minutos = meiaVida / 60;
        horas = minutos / 60;
        
        System.out.println("Tempo usado para atingir um valor menor do que 0.5: \n"        
                + "Horas " + horas + ":"
                + "Minutos " + minutos + ":" 
                + "Segundos " + segundos );
        
        
        
    }
    
}
