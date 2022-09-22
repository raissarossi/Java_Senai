package entidade;

public class Pessoa {

//    int calcularIdade(int nasc, int anoAtual){
//        return anoAtual-nasc;
//    }
//
//    void mostrarNome(String nome){
//        System.out.println("Meu nome é: "+ nome);
//    }
    String nome = "Lindomar";
    int idade;
    Pessoa(String n, int i){
        nome = n;
        idade = i;
    }
    Pessoa(){
        String nome = "Paulo";
        System.out.println(this.nome+nome);
    }
}
