public class Bhaskara {
    public static void main(String[] args) {
        System.out.println("Ola bom dia, para funcionar corretamente digite a equacao reduzida\n");
        String num = "1x²+2x+3";
        num = num.replaceAll(",", ".");
        if (num.indexOf("-")==0){}//do nothing
        else if (num.indexOf("+")==0){}//do nothing
        else{
            num = "+" + num;
        }
        num = num.toUpperCase();
        num = num.replace("²", "^2");
        int sinal =0;
        int a = num.indexOf("X^2");
        int b=0;
        int bCheck= 0; // define o começo de onde ele procura
        boolean aBool = num.contains("X^2"); // vefifica se contem
        // valor de a 
        // verificar se ha mais de 3 sinais, se tiver retornar erro
        if (aBool == false){
            System.out.println("POR FAVOR DIGITE UMA EQUAÇÃO VÁLIDA");
        }else{

            int mais = num.indexOf("+");
            int menos = num.indexOf("-");
            if (mais < menos){
                sinal = menos;
            }else{
                sinal = mais;
            }
        String semoa = num.substring(sinal, a+3);
        // converter a-1 para double com o sinal
        num = num.replace(semoa, "");
        String valueA = semoa.substring(0,semoa.length()-3);
        System.out.println("O VALOR DE 'A' É: "+valueA);
        //colocar um remover do index -1 de X^2

/* CODIGO INUTIL
        for (;;){ // laço de repetição infinito
            
            if (a == b){
                bCheck = a+1;
            }else {
                //System.out.println("O 'B' ESTA EM: "+b);
                break;
            }
        }

*/
        b = num.indexOf("X", bCheck);
        String semob = num.substring(b-1, b+1);
        num = num.replace(semob, "");
        String valueB = semob.substring(0,semob.length()-1);
        System.out.println("O VALOR DE 'B' É: "+valueB);
        System.out.println(num);

        //String[] semoa = num.split("+",3);
        //num = semoa[0];
        //System.out.println("aaa"+num);
        // pegar 'a' string 'a' -1
        // verifica se for um numero 'a' -1, se nao for, ele converte se nao ele define como 1
        // se 'a' -1 não for um numero ele verifica se é igual a '-', se não for ele define como '+'


        //verificar se B exite, se nao
    }}
}
