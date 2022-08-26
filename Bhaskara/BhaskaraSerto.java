public class BhaskaraSerto {
    public static int VerificarSinal (String num){
        int sinal = -1;
        int mais = num.indexOf("+",1);
        int menos = num.indexOf("-",1);
        System.out.println("valordemenos"+menos);
        if (mais == -1){
            mais = menos+1;
        }
        if (menos == -1){
            menos = mais+1;
        }

        sinal = (mais < menos?mais:menos);

        return sinal;
    }


    public static void main(String[] args) {
        
        System.out.println("Ola bom dia, para funcionar corretamente digite a equacao reduzida\n");
        String num = "1x²+2x+3";
        num = num.replaceAll(",", ".");
        if (num.indexOf("-")==0){}//do nothing
        else if (num.indexOf("+")==0){}//do nothing
        else{
            num = "+" + num;
        }
        num = num + "+";
        num = num + "=";
        num = num.toUpperCase();
        num = num.replace("²", "^2");

        int menos = num.indexOf("-");
        System.out.println(menos);
        System.out.println("r"+num);
        int sinal = VerificarSinal(num);

        System.out.println("k"+sinal);

        String akiA = num.substring(0, sinal);
        System.out.println(akiA);
                //RETIRAR O VALOR DE AKIA DE NUM

        sinal = VerificarSinal(num);
        String akiB = num.substring(0, sinal);
        System.out.println(akiB);
                //RETIRAR O VALOR DE AKIA DE NUM

        sinal = VerificarSinal(num);
        String akiC = num.substring(0, sinal);
        System.out.println(akiC);
    }
}

