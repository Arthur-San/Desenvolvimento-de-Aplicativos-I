/*
    3. Mariazinha tem 1,50m e cresce 2 centímetros por ano, enquanto 
    Maricota tem 1,10m e cresce 3 centímetros por ano. Construir um programa 
    que calcule e imprima quantos anos serão necessários para que Maricota 
    seja maior que Mariazinha.
*/
package revisao;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mariazinha = 150; //2cm por ano
        int maricota = 110; //3cm por ano
        int ano = 0;
        
        while(maricota <= mariazinha)
        {
            maricota = maricota + 3;
            mariazinha = mariazinha + 2;
            ano = ano + 1;
        }
        
        System.out.println(
                "Para maricota ficar > que mariazinha falta " 
                + ano 
                + " ano(s)");
        
        
    }
    
}
