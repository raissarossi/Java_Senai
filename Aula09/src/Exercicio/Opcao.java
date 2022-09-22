package Exercicio;

import java.util.Scanner;

public class Opcao {
    Scanner y = new Scanner(System.in);
    int x;
    void menu(){
        System.out.println("[1]- Opção 1" +
                "\n[2]- Opção 2" +
                "\n[3]- Opção 3" +
                "\n[4]- Opção 4" +
                "\n[5]- Exit"+
                "\nEscolha uma opção:");
        x = y.nextInt();
    }
    void escolha(){
        while (true){
            menu();
            if (x != 5){
                System.out.println("Você escolheu a opção: "+x);
            }
            else if (x>5 && x<1) {
                System.out.println("Entre com uma opção existente!");
            }
            else{
                break;
            }
        }
    }
}