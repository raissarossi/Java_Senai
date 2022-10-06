package veiculos;

import jdk.swing.interop.SwingInterOpUtils;

public class Situacao {
    double saldo = 0;
    double litros = 0;
    void situacao(){
        System.out.println("------------------SITUAÇÃO------------------");
        System.out.println("SALDO DA CARTEIRA: "+ saldo);
        System.out.println("QUANTIDADE DE LITROS NO TANQUE: "+litros);
    }

}
