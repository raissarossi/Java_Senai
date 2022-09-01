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


        double valorA = 0;
        double valorB = 0;
        double valorC = 0;

        String stringA;
        String stringB;
        String stringC;

        int x = 0;
            while (x<3){
                // num.lastIndex(); separar valor do original
                String Separador = num.substring(0, sinal);

                if (Separador.endsWith("X^2")){
                    int a =Separador.lastIndexOf("X^2");
                    stringA = Separador.substring(0,a);
                    stringA.replace("X^2", "");
                    valorA = Double.parseDouble(stringA);
                    System.out.println(valorA);
                    

                }
                if (Separador.endsWith("X")){
                    int b =Separador.lastIndexOf("X");
                    Separador = Separador.substring(0,b);
                    Separador = Separador.replace("X", "");
                    valorB = Double.parseDouble(Separador);
                    System.out.println(valorB);
                    
                }
                if ((!Separador.endsWith("X^2"))&&(!Separador.endsWith("X"))){
                    Separador = Separador.substring(VerificarSinal(Separador));
                    valorC = Double.parseDouble(Separador);
                    System.out.println(valorC);
                    
                }
                x++;
            }
    }
}
