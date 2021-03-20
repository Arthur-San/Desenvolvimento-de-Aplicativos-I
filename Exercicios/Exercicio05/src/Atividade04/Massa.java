
package Atividade04;
import java.util.Scanner;

public class Massa {    
    public static void main(String[] args) {
        
        double MassaInicial = 0;
        double MassaFinal = 0;
        int Segundos = 0;        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe a massa inicial em gramas.");
        MassaInicial = ler.nextDouble();
        MassaFinal = MassaInicial;
        
        
        while(MassaFinal > 0.5){            
            MassaFinal /= 2;
            Segundos += 50;
        }
        
        System.out.printf("Massa Inicial: %.2f\n", MassaInicial);
        System.out.printf("Massa Final..: %.4f\n", MassaFinal);
        System.out.println("Tempo Total.: " + FormataSegundos(Segundos));
    }
    
    
    private static String FormataSegundos(int Seg){
        int Hora, Minuto, Segundos;
        Hora     = (int)(Seg / (60 * 60));
        Minuto   = (int)((Seg - (Hora * 60 * 60)) / 60);
        Segundos = (int)(Seg - (Hora * 60 * 60) - (Minuto * 60));
        return  String.format("%02d:%02d:%02d", Hora, Minuto, Segundos);

    }

}
