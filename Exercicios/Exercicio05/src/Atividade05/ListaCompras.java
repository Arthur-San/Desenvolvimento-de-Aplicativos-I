
package Atividade05;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ListaCompras {
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> compras = new ArrayList();
        
        /*
        Lista de teste pré definida
        compras.add("banana");
        compras.add("maca");
        compras.add("abacaxi");
        compras.add("uva");
        compras.add("pera");
        */
        //declaração de atributos
        String test, item, modificar;
        int indice, lista;
        
        
        //menu - irá ficar em looping até o valor não ser igual a 8
        do
        {
        System.out.println(
                "********** Digite o serviço a ser utilizado **********\n" 
                + "1 - Adicionar \n"
                + "2 - Consultar\n"
                + "3 - Alterar\n"
                + "4 - Exibir o tamanho lista\n"
                + "5 - Remover item\n"
                + "6 - Classificar em ordem alfabética\n"
                + "7 - Limpar lista\n"
                + "8 - Sair\n");
        lista = ler.nextInt();
        
                
                switch (lista)
                {
                case 1:
                    test = ler.nextLine();
                    System.out.println("----Digite o item a ser adicionado----");
                    item = ler.nextLine();
                    compras.add(item);
                    System.out.println(item + " adicionado com sucesso!\n");
                    break;

                case 2:                
                    test = ler.nextLine();
                    System.out.println("----Digite o item a ser consultado----");
                    indice = ler.nextInt();                    
                    System.out.println(compras.get(indice) + " achado com sucesso!\n");
                    break;

                case 3:
                    System.out.println("Digite o item a ser modificado: ");
                    indice = ler.nextInt();
                    test = ler.nextLine();
                    System.out.println("Digite o valor da modificação: ");
                    modificar = ler.nextLine();
                    compras.set(indice, modificar);
                    System.out.println(compras.get(indice) );
                    break;    

                case 4:  
                    System.out.println("Itens da lista: " + compras);                    
                    System.out.println("O tamanho da lista é: " + compras.size());                    
                    break;    

                case 5:                
                    System.out.println("Itens da lista: " + compras);
                    System.out.println("Digite o índice a ser Removido: ");
                    indice = ler.nextInt();
                    compras.remove(indice);
                    System.out.println("Itens da lista: " + compras);
                    break;    

                case 6:                
                    System.out.println("Classificar em ordem alfabética: ");
                    Collections.sort(compras);
                    System.out.println(compras);
                    
                    break;

                case 7:                
                    System.out.println("Antes de Limpar lista: " + compras);
                    compras.clear();
                    System.out.println("Depois de Limpar a Lista: " + compras);
                    
                    break;
                    
                case 8:                
                    System.out.println("Você saiu do serviço!");
                    break;

                default:
                    System.out.println("Número do Serviço Inválido!");
                            
                }
        }while(lista != 8);
        
        
    }
    
}
