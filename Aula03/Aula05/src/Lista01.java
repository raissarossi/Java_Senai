import java.util.Arrays;
import java.util.Scanner;
import org.w3c.dom.ranges.Range;

public class Lista01 {
   public static void main(String[] args) {
//MOSTRAR LISTA
         String[] paises = {"Brasil", "Índia", "Afeganistão"};
         for(int i=0; i<paises.length; i++){
             System.out.println(paises[i]);

//POSIÇÃO NA LISTA
         int[] valores = {8, 6, 3, 9, 5, 2, 7, 4, 1};
         Scanner x =  new Scanner(System.in);
         System.out.println("Digite um número [1-9]: ");
         int y = x.nextInt();
         System.out.println("\n"+Arrays.toString(valores));
         for(int j=1; j<valores.length; j++){
             if(valores[j]==y){
                 System.out.println("O número [" + y + "] está em " + j+"° na lista");
             }
         }

//ORGANIZAR LISTA
         int[] valores = {8, 6, 3, 9, 5, 2, 7, 4, 1};
         System.out.println(Arrays.toString(valores));
         Arrays.sort(valores,0,valores.length);
         System.out.println("\n"+Arrays.toString(valores));

//PAR OU ÍMPAR
         Scanner x = new Scanner(System.in);
         System.out.println("Digite um número:");
         int y = x.nextInt();
             if(y%2 == 0){
                 System.out.println("Par");
             }
             else{
                 System.out.println("Ímpar");
             }

//VETOR E LISTA
        Scanner v = new Scanner(System.in);
        System.out.println("Insira o tamanho do vetor: ");
        int vetor = v.nextInt();
        int[] aux = new int[vetor];
        int impar = 0;
        int par = 0;
        int imparr = 0;
        int parr = 0;
        for (int j = 0; j < aux.length; j++) {
            System.out.printf("Insira o %dº número: \n", j + 1);
            aux[j] = v.nextInt();
            if (aux[j] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        int[] listaI = new int[impar];
        int[] listaP = new int[par];
//       for (int k = 0; k < aux.length; k++) {
//           if (aux[k] % 2 == 0) {
//               listaP[parr] = aux[k];
//               parr++;
//           } else {
//               listaI[imparr] = aux[k];
//               imparr++;
//           }
//       }
// também funciona

       for (int i : aux) {
           if (i % 2 == 0) {
               listaP[parr] = i;
               parr++;
           } else {
               listaI[imparr] = i;
               imparr++;
           }
       }
        System.out.println(Arrays.toString(listaP));
        System.out.println(Arrays.toString(listaI));

    }
}