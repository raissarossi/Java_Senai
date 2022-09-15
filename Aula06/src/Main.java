import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] matriz= {
                {"|Catifundo", "30", "150", "1.56|"},
                {"|Asnildo  ", "19", "90 ", "1.50|"},
                {"|Casnelfa ", "90", "85 ", "1.35|"},
        };
        String n = Arrays.deepToString(matriz[0]);
        String nn = Arrays.deepToString(matriz[1]);
        String nnn = Arrays.deepToString(matriz[2]);
        n = n.replace(","," | ");
        n = n.replace("[","");
        n = n.replace("]","");
        nn = nn.replace(","," | ");
        nn = nn.replace("[","");
        nn = nn.replace("]","");
        nnn = nnn.replace(","," | ");
        nnn = nnn.replace("[","");
        nnn = nnn.replace("]","");

        System.out.println("=============TABELA=============");
        System.out.println("|Nome      |Idade| Peso |Altura|");
        System.out.println("--------------------------------");
        System.out.println(n);
        System.out.println(nn);
        System.out.println(nnn);
    }
}
