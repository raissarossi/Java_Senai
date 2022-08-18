import java.math.MathContext;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Operadores {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Num1: ");
        double y = Double.parseDouble(num1);
        String num2 = JOptionPane.showInputDialog("Num2: ");
        double x = Double.parseDouble(num2);
        DecimalFormat f =new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null,"Valor da divisão: "+(y/x)+"\nValor arredondado: "+Math.round(y/x)+"\nValor arredondado para cima: "+(Math.ceil(y/x))+"\nValor arredondado para baixo: "+Math.floor(y/x)+ "\nPara baixo com decimal: "+f.format(y/x), "Divisão",1);
        
    
    }
}
