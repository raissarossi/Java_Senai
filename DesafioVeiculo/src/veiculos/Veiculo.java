package veiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
//    INFOS DE CARROS
    ArrayList<String> veiculoModeloC = new ArrayList<>();  ArrayList<Double> veiculoConsumoC = new ArrayList<>();
    ArrayList<Double> veiculoTanqueC = new ArrayList<>();  ArrayList<Integer> veiculoVelMaxC = new ArrayList<>();

//    INFOS DE MOTOS
    ArrayList<String> veiculoModeloM = new ArrayList<>();  ArrayList<Double> veiculoConsumoM = new ArrayList<>();
    ArrayList<Double> veiculoTanqueM = new ArrayList<>();  ArrayList<Integer> veiculoVelMaxM = new ArrayList<>();

//    INFOS DE OUTROS MODELOS
    ArrayList<String> veiculoModeloO = new ArrayList<>();  ArrayList<Double> veiculoConsumoO = new ArrayList<>();
    ArrayList<Double> veiculoTanqueO = new ArrayList<>();  ArrayList<Integer> veiculoVelMaxO = new ArrayList<>();

//    INFOS VEICULO QUE SERÁ USADO NO CÓDIGO
    String veiculoOficialModel = "";
    double veiculoOficialConsu;
    double veiculoOficialTanqu;
    double veiculoOficialVelMa;

    Scanner op1 = new Scanner(System.in);
    void escolhaVeiculos(){
        while(true) {
            System.out.println("""
                    -------------- MENU INICIAL --------------
                    [0]- Sair
                    [1]- Adicionar
                    [2]- Listar
                    [3]- Escolher""");
            System.out.print("Escolha uma opção: ");
            int opcaoVeiculo = op1.nextInt();
            if (opcaoVeiculo == 0) {
                break;
            }
            else if (opcaoVeiculo == 1) {
                adicionarVeiculo();
            }
            else if (opcaoVeiculo == 2){
                listarVeiculo();
            }
            else if (opcaoVeiculo == 3){
                escolherVeiculo();
                if (!(veiculoOficialModel.equals(""))) {
                    System.out.println("COMECANDO JOJO");
                    break;
                }
            }
        }
    }
    void adicionarVeiculo() {
            while (true) {
                System.out.println("""
                        --------------- ADICIONAR ----------------
                        [0]- Sair
                        [1]- Carro
                        [2]- Moto
                        [3]- Outro""");
                System.out.print("Escolha uma opção: ");
                int opcaoAdicionar = op1.nextInt();
                op1.nextLine();
                if (opcaoAdicionar == 0) {
                    break;
                }
                else if (opcaoAdicionar == 1) {
                    System.out.println("Modelo:");
                    String modelo = op1.nextLine();
                    veiculoModeloC.add(modelo);

                    System.out.print("Consumo: ");
                    double consumo = op1.nextDouble();
                    veiculoConsumoC.add(consumo);

                    System.out.print("Tanque: ");
                    double tanque= op1.nextDouble();
                    veiculoTanqueC.add(tanque);

                    System.out.print("VelMaxima: ");
                    int velocidade = op1.nextInt();
                    veiculoVelMaxC.add(velocidade);

//                    System.out.print("\nModelo: "+veiculoModelo.get(0));
//                    System.out.print("\nConsumo:"+veiculoConsumo.get(0));
//                    System.out.print("\nTanque:"+veiculoTanque.get(0));
//                    System.out.print("\nVel Max:"+veiculoVelMax.get(0)+"\n");
                }
                else if (opcaoAdicionar == 2) {
                    System.out.println("Modelo:");
                    String modelo = op1.nextLine();
                    veiculoModeloM.add(modelo);

                    System.out.print("Consumo: ");
                    double consumo = op1.nextDouble();
                    veiculoConsumoM.add(consumo);

                    System.out.print("Tanque: ");
                    double tanque= op1.nextDouble();
                    veiculoTanqueM.add(tanque);

                    System.out.print("VelMaxima: ");
                    int velocidade = op1.nextInt();
                    veiculoVelMaxM.add(velocidade);

//                    System.out.print("\nModelo: "+ veiculoModeloM.get(0));
//                    System.out.print("\nConsumo:"+veiculoConsumoM.get(0));
//                    System.out.print("\nTanque:"+ veiculoTanqueM.get(0));
//                    System.out.print("\nVle Max:"+veiculoVelMaxM.get(0)+"\n");
                }
                else if (opcaoAdicionar == 3) {
                    System.out.println("Tipo de veículo quer adicionar:");
                    String modelo = op1.nextLine();
                    veiculoModeloO.add(modelo);

                    System.out.print("Consumo: ");
                    double consumo = op1.nextDouble();
                    veiculoConsumoO.add(consumo);

                    System.out.print("Tanque: ");
                    double tanque= op1.nextDouble();
                    veiculoTanqueO.add(tanque);

                    System.out.print("VelMaxima: ");
                    int velocidade = op1.nextInt();
                    veiculoVelMaxO.add(velocidade);

//                    System.out.print("\nModelo: "+ veiculoModeloO.get(0));
//                    System.out.print("\nConsumo:"+veiculoConsumoO.get(0));
//                    System.out.print("\nTanque:"+ veiculoTanqueO.get(0));
//                    System.out.print("\nVle Max:"+veiculoVelMaxO.get(0)+"\n");
                }
            }
    }
    void listarVeiculo(){
        while(true) {
            System.out.println("""
                    ----------------- LISTAR -----------------
                    [0]- Sair
                    [1]- Carro
                    [2]- Moto
                    [3]- Outros""");
            System.out.print("Escolha uma opção: ");
            int opcaoListar = op1.nextInt();
            op1.nextLine();
            if (opcaoListar == 0){
                break;
            }
            else if(opcaoListar == 1){
                System.out.println(veiculoModeloC+"\n"+veiculoConsumoC+"\n"+veiculoTanqueC+"\n"+veiculoVelMaxC);
            }
            else if(opcaoListar == 2){
                System.out.println(veiculoModeloM+"\n"+veiculoConsumoM+"\n"+veiculoTanqueM+"\n"+veiculoVelMaxM);
            }
            else if(opcaoListar == 3){
                System.out.println(veiculoModeloO+"\n"+veiculoConsumoO+"\n"+veiculoTanqueO+"\n"+veiculoVelMaxO);
            }


        }
    }
    void escolherVeiculo(){
        System.out.println("""
                    ----------------- ESCOLHA -----------------
                    [0]- Sair
                    [1]- Carro
                    [2]- Moto
                    [3]- Outros""");
        System.out.print("Escolha uma opção: ");
        int opcaoListar = op1.nextInt();
        op1.nextLine();

        if (opcaoListar == 0){
            System.out.println("\n");
        }

        else if(opcaoListar == 1){
        mostrarCarros();
        System.out.println("Insira o modelo escolhido: ");
        int indexC = op1.nextInt();
        if (indexC == 0) {
            System.out.println("votlando");
        }else{
            indexC = indexC - 1;

            veiculoOficialModel = veiculoModeloC.get(indexC);
            veiculoOficialConsu = veiculoConsumoC.get(indexC);
            veiculoOficialTanqu = veiculoTanqueC.get(indexC);
            veiculoOficialVelMa = veiculoVelMaxC.get(indexC);
        }
        }
        else if(opcaoListar == 2){
        mostrarMotos();
        System.out.println("Insira o modelo escolhido: ");
        int indexM = op1.nextInt();
        if (indexM == 0) {
            System.out.println("votlando");
        }else{
            indexM = indexM - 1;

            veiculoOficialModel = veiculoModeloM.get(indexM);
            veiculoOficialConsu = veiculoConsumoM.get(indexM);
            veiculoOficialTanqu = veiculoTanqueM.get(indexM);
            veiculoOficialVelMa = veiculoVelMaxM.get(indexM);
        }
        }
        else if(opcaoListar == 3){
        mostrarOutros();
        System.out.println("Insira o modelo escolhido: ");
        int indexO = op1.nextInt();
        if (indexO == 0) {
            System.out.println("votlando");
        }else{
            indexO = indexO - 1;

            veiculoOficialModel = veiculoModeloO.get(indexO);
            veiculoOficialConsu = veiculoConsumoO.get(indexO);
            veiculoOficialTanqu = veiculoTanqueO.get(indexO);
            veiculoOficialVelMa = veiculoVelMaxO.get(indexO);
        }
        }
    }

    void mostrarCarros(){
        int index = 0;
        System.out.println("----------------- CARROS -----------------");
        System.out.println("[0] - Sair");
        for (String i : veiculoModeloC){
            index += 1;
            System.out.printf("[%d]- %s\n",index,i);
            System.out.printf("     %.2f\n", veiculoConsumoC.get(index-1));
            System.out.printf("     %.2f\n", veiculoTanqueC.get(index-1));
            System.out.printf("     %.2d\n", veiculoVelMaxC.get(index-1));
        }
    }
    void mostrarMotos(){
        int index = 0;
        System.out.println("----------------- MOTOS ------------------");
        for (String i : veiculoModeloM){
            index += 1;
            System.out.printf("[%d]- %s\n",index,i);
            System.out.printf("     %f\n", veiculoConsumoM.get(index-1));
            System.out.printf("     %f\n", veiculoTanqueM.get(index-1));
            System.out.printf("     %d\n", veiculoVelMaxM.get(index-1));

        }
    }
    void mostrarOutros(){
        int index = 0;
        System.out.println("----------------- OUTROS -----------------");
        for (String i : veiculoModeloO){
            index += 1;
            System.out.printf("[%d]- %s\n",index,i);
            System.out.printf("     %f\n", veiculoConsumoO.get(index-1));
            System.out.printf("     %f\n", veiculoTanqueO.get(index-1));
            System.out.printf("     %d\n", veiculoVelMaxO.get(index-1));
        }
    }

}
