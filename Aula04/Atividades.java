import java.util.Scanner;  import javax.swing.JOptionPane;
import java.lang.Math;  import java.text.DecimalFormat;


public class Atividades {
    public static void main(String[] args) {

    //1- AREA, DIAMETER AND CIRCUMFERENCE FROM THE RADIUS------------------------------------------------------------------------------------------
        Scanner r = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#.00");
        System.out.println("Enter the radius value:");
        double rr = r.nextDouble();
        double d = (2 * rr);
        double a = ((Math.PI)*(Math.pow(rr, 2)));
        double c = 2 * (Math.PI) * rr;

        System.out.println("Area= " + f.format(a));
        System.out.println("Diameter= " + f.format(d));
        System.out.println("Circumference= " + f.format(c));

    //OR

        String raio = JOptionPane.showInputDialog("Enter the radius:");
        double r = Double.parseDouble(raio);
        DecimalFormat f = new DecimalFormat("#.00");
        double a = ((Math.PI)*(Math.pow(r, 2)));
        double d = (2 * r);
        double c = 2 * (Math.PI) * r;
        JOptionPane.showMessageDialog(null, "Area = " + f.format(a) + "\nDiameter = " + f.format(d) + "\nCircumference = " + f.format(c),
         "Answer", 1);



    //2-CALCULATE IMC--------------------------------------------------------------------------------------------------------------------------------
        Scanner w = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = w.nextDouble();
        Scanner h = new Scanner(System.in);
        System.out.println("Enter your height: ");
        double height = h.nextDouble();
        double imc = (weight/(height*height));
        System.out.println("Your IMC is: "+imc);
        
    //OR

        String weight = JOptionPane.showInputDialog("Enter your weight:");
        int w = Integer.parseInt(weight);
        String height = JOptionPane.showInputDialog("Enter your height:");
        double h = Double.parseDouble(height);
        double imc = (w/(h*h));
        String grade =("");
        DecimalFormat f = new DecimalFormat("#.00");

        if (imc < 18.5){
            grade = "Thinness";
        }
        else if (imc>18.5 && imc <24.9){
            grade = "Healthy";
        }
        else if (imc>18.5 && imc <24.9){
            grade = "Overweight";
        }
        else if (imc>=25.0 && imc <29.9){
            grade = "Obesity grade I";
        }
        else if (imc>30.0 && imc <34.9){
            grade = "Obesity grade II";
        }
        else if (imc>=40.0){
            grade = "Obesity grade III";
        }
    

        JOptionPane.showMessageDialog(null,"Your IMC " + f.format(imc), "IMC", 1);
        JOptionPane.showMessageDialog(null, grade , "IMC", 1);

    //FOR
        for(int i=0; i<11; i++){
            System.out.print("  |  " + i);

         }

        String[] paises = {"Brasil","Índia", "Rússia", "China"};
        for(int i=0; i<paises.length; i++){
            System.out.print("  |  " + paises[i]);
        }

        int[] valores = {1,4,8,2,9,5,6,3,7,0};
        for(int j=0; j<valores.length; j++){
            System.out.print("  |  " + valores[j]);
        }
        System.out.println("\n"+Arrays.toString(valores));
    }
}
