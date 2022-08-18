import java.util.Scanner;

public class Idade {

    public static void main(String[]args){
        int y= 8;
        Scanner id = new Scanner(System.in);
        System.out.println("Idade: ");
        int x = id.nextInt();
        System.out.println(x+y);
        id.close();
    }
}
