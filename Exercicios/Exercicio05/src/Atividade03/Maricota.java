
package Atividade03;
import java.util.Scanner;

public class Maricota {
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
        
        System.out.println("Para maricota ficar > que mariazinha falta " + ano + " ano(s)");
        
        
    }
    
}
