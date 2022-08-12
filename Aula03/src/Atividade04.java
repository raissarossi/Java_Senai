import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Você é M ou H? ");
		char c = s.next().charAt(0);
		
		System.out.println("Qual sua altura? ");
		double h = s.nextDouble();
		
		if (c == 'm') {
			System.out.println((62.1*h)-44.7);
		}
		else if (c == 'm') {
			System.out.println((72.1*h)-58);
		}
		else {
			System.out.println("Não");
		}
		
		
		
		

	}

}
