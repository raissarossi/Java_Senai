package veiculos;

import java.util.Random;
import java.util.Scanner;


public class Menu {
    Scanner y = new Scanner(System.in);
    int x;
    double veloc = 0;
    double km = 0;
    double litros = 0;

    void menu() {
        while (true) {
            System.out.println("""
                    --------------------MENU--------------------
                    [0]- Sair
                    [1]- Acelerar
                    [2]- Desacelerar
                    [3]- Manutenção
                    [4]- Abastecer
                    [5]- Banco
                    ESCOLHA UMA OPÇÃO:""");
            x = y.nextInt();

            if (x == 0) {
                break;
            } else if (x > 5 || x < 0) {
                System.out.println("Escolha uma opção existente!");
            } else {
                escolha(x);
            }
        }
    }

    void escolha(int valor) {
        if (valor == 1) {
            aceleracao();
        }
        if (valor == 2) {
            desaceleracao();
        }
        if (valor == 3) {
            manutencao();
        }
        if (valor == 4) {
            postos();
        }
        if (valor == 5) {
            banco();
        }
    }

    void aceleracao() {
        veloc += 10;
        System.out.println("SUA VELOCIDADE É: " + veloc);
    }

    void desaceleracao() {
        veloc -= 10;
        System.out.println("SUA VELOCIDADE É: " + veloc);
    }

    void manutencao() {
        String[] frases = {"PRECISA TROCAR O ÓLEO", "PRECISA ENCHER OS PNEUS", "NO MOMENTO ESTÁ TUDO EM ORDEM"};
        Random rand = new Random();
        int a = rand.nextInt(3);
        System.out.println(frases[a]);
    }


    void postos() {
        System.out.println("""
                -------------------POSTOS-------------------
                [1]- Petrobrás      -->         4,90
                [2]- Shell          -->         5,10
                [3]- Ipiranga       -->         4,80
                [4]- Esso           -->         5,00
                [5]- Sair
                ESCOLHA UM POSTO:""");
        x = y.nextInt();
        if (x == 5) {
            System.out.println("tchau");
        } else if (x > 5 || x < 1) {
            System.out.println("Escolha uma opção existente!");
        } else {
            escolhaP(x);
        }
    }

    void escolhaP(int valor) {
        double[] precos = {4.9, 5.10, 4.8, 5};
        System.out.println("Quantos reais vai colocar?");
        while (true) {
            double valorD = y.nextDouble();
            if (valor == 1) {
                litros += valorD / precos[valor - 1];
                System.out.printf("%.2f\n", litros);
                break;
            }
            if (valor == 2) {
                litros += valorD / precos[valor - 1];
                System.out.printf("%.2f\n", litros);
                break;
            }
            if (valor == 3) {
                litros += valorD / precos[valor - 1];
                System.out.printf("%.2f\n", litros);
                break;
            }
            if (valor == 4) {
                litros += valorD / precos[valor - 1];
                System.out.printf("%.2f\n", litros);
                break;
            } else {
                System.out.println("Escolha uma opção existente!");
            }
        }
    }


    void banco() {
        System.out.println("""
                -------------------BANCO-------------------
                [1]- Ver Saldo
                [2]- Sacar
                [3]- Depositar
                [4]- Sair
                ESCOLHA UM POSTO:""");
        x = y.nextInt();
        if (x == 4) {
            System.out.println("tchau");
        } else if (x > 4 || x < 1) {
            System.out.println("Escolha uma opção existente!");
        } else {
            escolhaB(x);
        }
    }

    double saldo = 100;
    void escolhaB(int valor) {
        while (true) {

            if (valor == 1) {
                System.out.println(saldo);
            }
            if (valor == 2) {
                System.out.println("SALDO ATUAL: "+saldo+"\nQuanto deseja sacar?");
                double saque = y.nextDouble();
                if (saque <= saldo) {
                    saldo-=saque;
                    System.out.println("SALDO ATUAL: " + saldo);
                } else {
                    System.out.println("SALDO INSUFICIENTE!");
                }
            } else if (valor == 0) {
                break;
            }
        }

        }

}


