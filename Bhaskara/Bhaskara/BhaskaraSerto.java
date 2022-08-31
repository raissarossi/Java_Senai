public class BhaskaraSerto {
    public static int VerificarSinal (String num){
        int sinal = -1;
        int mais = num.indexOf("+",1);
        int menos = num.indexOf("-",1);
        System.out.println("valorDeMenos "+menos);
        if (mais == -1){
            mais = menos+1;
        }
        if (menos == -1){
            menos = mais+1;
        }

        sinal = (mais < menos?mais:menos);

        return sinal;
    }

    public static double ConverterABC(String converter) {
        if (converter.endsWith("X^2")){
            int a =converter.lastIndexOf("X^2");
            converter = converter.substring(0,a);
            double valorA = Double.parseDouble(converter);
            return valorA;
        }
        if (converter.endsWith("X")){
            int b =converter.lastIndexOf("X");
            return b;
        }
        if ((!converter.endsWith("X^2"))&&(!converter.endsWith("X"))){
            int c =converter.lastIndexOf("X");
            return c;
        }
        return 0;
    }

    public static void main(String[] args) {
        
        System.out.println("Ola bom dia, para funcionar corretamente digite a equacao reduzida\n");
        String num = "2x+3+1x²";
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


        

        String aki1 = num.substring(0, sinal);
        ConverterABC(aki1);
        System.out.println("aki1 "+aki1);
                //RETIRAR O VALOR DE AKI1 DE NUM

        sinal = VerificarSinal(num);
        String aki2 = num.substring(0, sinal);
        System.out.println("aki2 "+aki2);
                //RETIRAR O VALOR DE AKI2 DE NUM

        sinal = VerificarSinal(num);
        String aki3 = num.substring(0, sinal);
        System.out.println("aki3 "+aki3);
    }
}
