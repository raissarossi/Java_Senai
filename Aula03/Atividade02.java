import java.util.Scanner;

public class Atividade02 {
//		y = x , if x < 1;
//		y = 0 , if x = 1;
//		y = x*x , if x >1;
	public static void main(String[] args) {
		int y = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int x= n.nextInt();
		
		if(x<1) {
			y = x;
		}
		
		if(x==1) {
			y = 0;
		}
		
		if(x>1) {
			y = x*x;
		}
		
		System.out.println("x=" + y);

	}

}
