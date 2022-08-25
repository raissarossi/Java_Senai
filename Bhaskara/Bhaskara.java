public class Bhaskara {
    public static void main(String[] args) {
        System.out.println("Ola bom dia, para funcionar corretamente digite a equacao reduzida\n");
        String num = "2x²+2x+3";
        num = num.toUpperCase();
        num = num.replace("²", "^2");
        int a = num.indexOf("X^2");
        int bCheck= 0; // define o começo de onde ele procura
        boolean aBool = num.contains("X^2"); // vefifica se contem

        // verificar se ha mais de 3 sinais, se tiver retornar erro
        if (aBool == false){
            // para o programa
            // printar A EQUAÇÃO NAO É QUADRATICA
        }

        System.out.println("O 'A' ESTA EM: "+a);
        //colocar um remover do index -1 de X^2
        System.out.println(num);
        for (;;){ // laço de repetição infinito
            int b = num.indexOf("X", bCheck);
            if (a == b){
                bCheck = a+1;
            }else {
                System.out.println("O 'B' ESTA EM: "+b);
                break;
            }
        }
        String semoa = num.substring(a-1, a+3);
        num = num.replace(semoa, "");
        System.out.println(num);
        //String[] semoa = num.split("+",3);
        //num = semoa[0];
        //System.out.println("aaa"+num);
        // pegar 'a' string 'a' -1
        // verifica se for um numero 'a' -1, se nao for, ele converte se nao ele define como 1
        // se 'a' -1 não for um numero ele verifica se é igual a '-', se não for ele define como '+'

        // converter a-1 para double com o sinal

        //verificar se B exite, se nao
    }
}
