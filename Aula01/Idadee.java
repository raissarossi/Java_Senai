import javax.swing.JOptionPane;

public class Idadee {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Seu nome: ");
        String ano = JOptionPane.showInputDialog("Seu ano: ");
        int y = Integer.parseInt(ano);
        int sub = (2022-y);
        //System.out.println(nome+" possui "+(2022-y)+" anos");
        //System.out.println(sub>=18?"Você é maior de idade":"Você não é");
        JOptionPane.showMessageDialog(null, sub>=18?"Você é maior de idade:)":"Você não é maior de idade:(", "idade", 1);
    }
    
}
