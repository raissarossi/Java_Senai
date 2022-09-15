import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("DIGITE O TAMANHO DO VETOR: ");
        int tam = x.nextInt();
        int entrada;

        for(int j=0; j<tam; j++){
            System.out.printf("DIGITE O VALOR %d: ", j+1);
            entrada = x.nextInt();
            valores.add(entrada);
            if(entrada%2==0){
               pares.add(entrada) ;
            }if(entrada%2==1){
               impares.add(entrada);
            }
        }
        System.out.println("LISTA: "+valores);
        System.out.println("PARES: "+pares);
        System.out.println("IMPARES: "+impares);
    }
}
