public class BhaskaraSerto {
    public static int VerificarSinal (String num){
        int sinal = -1;
        int mais = num.indexOf("+");
        int menos = num.indexOf("-");
        System.out.println("valordemenos"+menos);
        if          ((mais < menos)&&(mais != 0)){
            sinal = menos;
        }else if    ((menos < mais)&&(menos != 0)){
            sinal = mais;
        }
        return sinal;
    }


    public static void main(String[] args) {
        
        System.out.println("Ola bom dia, para funcionar corretamente digite a equacao reduzida\n");
        String num = "-1x²+2x+3";
        num = num.replaceAll(",", ".");
        if (num.indexOf("-")==0){}//do nothing
        else if (num.indexOf("+")==0){}//do nothing
        else{
            num = "+" + num;
        }
        num = num.toUpperCase();
        num = num.replace("²", "^2");

        int menos = num.indexOf("-");
        System.out.println(menos);
        System.out.println("r"+num);
        int sinal = VerificarSinal(num);

        System.out.println("k"+sinal);

    }
}
