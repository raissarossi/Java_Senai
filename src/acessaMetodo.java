/*public class acessaMetodo {
    
    public void imprime(){
        System.out.println("Welcome");
    }

    public static void main(String[] args){
        acessaMetodo acessa= new acessaMetodo();
        acessa.imprime();
    }
}*/

import java.util.Scanner;

public class acessaMetodo {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nome: ");
        String nome = s.nextLine();
        System.out.println(nome);
        s.close();

    }
}