/*
    Feito por Arthur dos Santos e Eduardo Nicolodi
*/

package Ex11;

import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Cachorro c = new Cachorro();
        Papagaio p = new Papagaio();
        Mosca m = new Mosca();

        int indice = 1, indice2, indice3, indice4;
        String resultado1 = null, resultado2 = null, resultado3  = null;

        while (indice != 0) {
            System.out.println("\nCrie um animal Frankenstein: \n"
                    + "1 - Cabeça\n"
                    + "2 - Tronco\n"
                    + "3 - Patas\n"
                    + "4 - Mostrar Animal\n"
                    + "0 - Sair\n");
            indice = ler.nextInt();
            ler.nextLine();

            switch (indice) {
                case 1:
                    System.out.println("\nEscolha uma cabeça\n"
                            + "1 - cachorro\n"
                            + "2 - Papagaio\n"
                            + "3 - Mosca\n");
                    indice2 = ler.nextInt();
                    ler.nextLine();
                
                    if (indice2 == 1) {
                        System.out.println("Cabeça de Cachorro Adicionada!\n");
                        c.setCabeca("Cachorro");
                        resultado1 = c.getCabeca();
                    } else if (indice2 == 2) {
                        System.out.println("Cabeça de Papagaio Adicionada!\n");
                        p.setCabeca("Papagaio");
                        resultado1 = p.getCabeca();
                    } else {
                        System.out.println("Cabeça de Mosca Adicionada!\n");
                        m.setCabeca("Mosca");
                        resultado1 = m.getCabeca();
                    }
                    break;

                case 2:
                    System.out.println("\nEscolha um Tronco\n"
                            + "1 - cachorro\n"
                            + "2 - Papagaio\n"
                            + "3 - Mosca\n");
                    indice3 = ler.nextInt();
                    ler.nextLine();

                    if (indice3 == 1) {
                        System.out.println("Tronco de Cachorro Adicionado!\n");
                        c.setTronco("Cachorro");
                        resultado2 = c.getTronco();
                    } else if (indice3 == 2) {
                        System.out.println("Tronco de Papagaio Adicionado!\n");
                        p.setTronco("Papagaio");
                        resultado2 = p.getTronco();
                    } else {
                        System.out.println("Tronco de Mosca Adicionado!\n");
                        m.setTronco("Mosca");
                        resultado2 = m.getTronco();
                    }
                    break;

                case 3:
                    System.out.println("\nEscolha as Patas\n"
                            + "1 - cachorro\n"
                            + "2 - Papagaio\n"
                            + "3 - Mosca\n");
                    indice4 = ler.nextInt();
                    ler.nextLine();

                    if (indice4 == 1) {
                        System.out.println("Patas de Cachorro Adicionado!\n");
                        c.setPatas("Cachorro");
                        resultado3 = c.getPatas();
                    } else if (indice4 == 2) {
                        System.out.println("Patas de Papagaio Adicionado!\n");
                        p.setPatas("Papagaio");
                        resultado3 = p.getPatas();
                    } else {
                        System.out.println("Patas de Mosca Adicionado!\n");
                        m.setPatas("Mosca");
                        resultado3 = m.getPatas();
                    }
                    break;

                case 4:
                    System.out.println("*********Seu animal tem*********\n"
                            + "Cabeça de: " + resultado1 + "\n"
                            + "Tronco de: " + resultado2 + "\n"
                            + "Patas de: " + resultado3);                            
                    break;
                    
                    
                    
                case 0:
                    indice = 0;
                    System.out.println("*********O animal que você montou*********\n"
                            + "Cabeça de: " + resultado1 + "\n"
                            + "Tronco de: " + resultado2 + "\n"
                            + "Patas de: " + resultado3);
                break;
                
                
                
                

                default:
                    System.out.println("Digite um valor Válido");

            }
        }

    }

}
