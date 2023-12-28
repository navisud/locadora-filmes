package com.locadora;

import java.util.Scanner;

public class Gerente {

    public static void cadastrarFilme(){
        Scanner ler = new Scanner(System.in);
        int loop = 1;

        while(true) {
            System.out.println("Insira o nome do filme");
            String nome = ler.nextLine();

            System.out.println("Duração do filme:");
            float duracao = ler.nextFloat();

            System.out.println("Preço do Filme");
            float preco = ler.nextFloat();

            System.out.println("O filme foi alugado?\n1 para sim, 0 para não");
            int alugado = ler.nextInt();

            if (alugado == 1){
                String a = "Sim";
                System.out.println("\nNome do Filme: "+nome+",\nDuração: "+duracao+" minutos,\nPreço: R$"+preco+" reais,\nAlugado: "+a);
            } else {
                String a = "Não";
                System.out.println("\nNome do Filme: "+nome+",\nDuração: "+duracao+" minutos,\nPreço: R$"+preco+" reais,\nAlugado: "+a);
            }

            System.out.println("\nSe as informações estiverem corretas digite 0 para continuar ou 1 para voltar...");
            int teste = ler.nextInt();

            if (teste == 0){
                if (alugado == 1) {
                    boolean aluguel = true;
                    Filme filme = new Filme(nome, duracao, preco, aluguel);
                } else if (alugado == 0) {
                    boolean aluguel = false;
                    Filme filme = new Filme(nome, duracao, preco, aluguel);
                } else {
                    System.out.println("\nErro! Informe apenas 0 ou 1 para continuar!");
                    // tratar exception de erro
                }
                System.out.println("\nFilme cadastrado com sucesso!\nSaindo...");
                break;
            }else{
                ler.nextLine();
                continue;
            }

        }
    }
    public static void cadastrarCliente() {
        Scanner ler = new Scanner(System.in);

        while(true) {
            System.out.println("Insira seu nome: ");
            String nome = ler.nextLine();
            ler.nextLine();

            System.out.println("Insira seu cpf:");
            String cpf = ler.next();

            System.out.println("Insira seu telefone:");
            String tel = ler.next();
            ler.nextLine();

            System.out.println("Insira seu endereço:");
            String endereco = ler.nextLine();

            System.out.println("\nNome: "+nome+",\nCPF: "+cpf+",\nTelefone: "+tel+",\nEndereço: "+endereco);

            System.out.println("\nSe as informações estiverem corretas insira 0 para continuar ou 1 para voltar...");
            int loop = ler.nextInt();
            ler.nextLine();

            if (loop == 0) {
                Cliente cliente = new Cliente(nome, cpf, tel, endereco);
                System.out.println("\nCliente cadastrado com sucesso!\nSaindo...");
                break;
            } else{
                loop = 1;
            }

        }
    }
}
