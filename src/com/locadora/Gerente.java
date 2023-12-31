package com.locadora;

import java.util.Scanner;

public class Gerente {
    // adicionar metódos delete para deletear os filmes e usuários
    public static Filme cadastrarFilme() {
        //cadastrar filme funcionando
        String nome;
        float preco, duracao;
        int alugado;
        boolean aluguel = false;

        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Insira o nome do filme");
            nome = ler.nextLine();

            System.out.println("Duração do filme:");
            duracao = ler.nextFloat();

            System.out.println("Preço do Filme");
            preco = ler.nextFloat();

            System.out.println("Se o filme foi alugado digite 1, senão digite 0");
            alugado = ler.nextInt();

            if (alugado == 1) {
                String a = "Sim";
                System.out.println("\nNome do Filme: " + nome + ",\nDuração: " + duracao + " minutos,\nPreço: R$" + preco + " reais,\nAlugado: " + a);
            } else {
                String a = "Não";
                System.out.println("\nNome do Filme: " + nome + ",\nDuração: " + duracao + " minutos,\nPreço: R$" + preco + " reais,\nAlugado: " + a);
            }
            // fazer tratamendo da Exception e verificação aqui

            System.out.println("\nSe as informações estiverem corretas digite 0 para continuar ou 1 para voltar...");
            int teste = ler.nextInt();

            if (teste == 0) {
                if (alugado == 1) { aluguel = true; }
                break;
            } else {
                ler.nextLine();
                continue;
            }
        }

        Filme filme = new Filme(nome, duracao, preco, aluguel);
        System.out.println("\nFilme cadastrado com sucesso!\nSaindo...");

        return filme;
    }

    public static void consultarFilme(Filme filme){
        //consultar filme funcionando
        Scanner ler = new Scanner(System.in);

        while(true) {
            // menu
            System.out.println("\n|--------| MENU |--------|");
            System.out.println("| 1 - Consulta Nome      |");
            System.out.println("| 2 - Consulta Preço     |");
            System.out.println("| 3 - Consulta Aluguel   |");
            System.out.println("|------------------------|");
            int menu = ler.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("\n" + filme.getTitulo());
                    break;
                }
                case 2: {
                    System.out.println("\n" + filme.getPreco());
                    break;
                }
                case 3: {
                    System.out.println("\n" + filme.isAlugado());
                    break;
                }
            }

            System.out.println("\nDigite 0 para sair e 1 para voltar...");
            int n = ler.nextInt();

            if (n == 0){
                System.out.println("\nSaindo...");
                break;
            }
        }
    }

    public static void editarFilme(Filme filme){
        String nome;
        float preco;
        int alugado;


        Scanner ler = new Scanner(System.in);

        while(true) {
            // menu
            System.out.println("\n|-------| MENU |-------|");
            System.out.println("| 1 - Editar Título    |");
            System.out.println("| 2 - Editar Preço     |");
            System.out.println("| 3 - Editar Aluguel   |");
            System.out.println("| 4 - Todos os dados   |");
            System.out.println("|----------------------|");
            int menu = ler.nextInt();

            switch (menu) {
                case 1: {
                    ler.nextLine();
                    System.out.println("Insira o novo título:");
                    nome = ler.nextLine();
                    filme.setTitulo(nome);
                    System.out.println("\nO novo título é: "+filme.getTitulo());
                    break;
                }
                case 2: {
                    ler.nextLine();
                    System.out.println("Insira o novo preço:");
                    preco = ler.nextFloat();
                    filme.setPreco(preco);
                    System.out.println("\nO novo preço é: R$"+filme.getPreco()+" reais");
                    break;
                }
                case 3: {
                    ler.nextLine();
                    System.out.println("Insira 1 para alugado e 0 para não alugado:");
                    alugado = ler.nextInt();
                        if (alugado == 1){
                            filme.setAlugado(true);
                        } else{
                            filme.setAlugado(false);
                        }
                    System.out.println("\nEstá alugado?: "+filme.isAlugado());
                    break;
                }
                case 4: {
                    System.out.println("\nNovos dados do filme:");
                    System.out.println("\nTítulo: "+filme.getTitulo()+",");
                    System.out.println("Preço: R$"+filme.getPreco()+",");
                    System.out.println("Alugado?: "+filme.isAlugado()+",");
                }
            }

            System.out.println("\nDigite 0 para sair e 1 para voltar...");
            int n = ler.nextInt();

            if (n == 0){
                System.out.println("\nSaindo...");
                break;
            }
        }
    }

    public static Cliente cadastrarCliente() {
        // cadastrar cliente funcionando
        String nome, cpf, tel, endereco;

        Scanner ler = new Scanner(System.in);
        while (true) {
            System.out.println("Insira seu nome: ");
            nome = ler.nextLine();
            ler.nextLine();

            System.out.println("Insira seu cpf:");
            cpf = ler.next();

            System.out.println("Insira seu telefone:");
            tel = ler.next();
            ler.nextLine();

            System.out.println("Insira seu endereço:");
            endereco = ler.nextLine();

            System.out.println("\nNome: " + nome + ",\nCPF: " + cpf + ",\nTelefone: " + tel + ",\nEndereço: " + endereco);

            System.out.println("\nSe as informações estiverem corretas insira 0 para continuar ou 1 para voltar...");
            int loop = ler.nextInt();
            ler.nextLine();

            if (loop == 0) {
                break;
            }
        }

        Cliente cliente = new Cliente(nome, cpf, tel, endereco);
        System.out.println("\nCliente cadastrado com sucesso!\nSaindo...");

    return cliente;
    }

    public static void consultarCliente(Cliente cli){
        //consultar cliente funcionando
        Scanner ler = new Scanner(System.in);

        while(true) {
            // menu
            System.out.println("\n|--------| MENU |--------|");
            System.out.println("| 1 - Consulta Nome      |");
            System.out.println("| 2 - Consulta Cpf       |");
            System.out.println("| 3 - Consulta Telefone  |");
            System.out.println("| 4 - Consulta Endereço  |");
            System.out.println("| 5 - Consulta Filme     |");
            System.out.println("|------------------------|");
            int menu = ler.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("\n" + cli.getNome());
                    break;
                }
                case 2: {
                    System.out.println("\n" + cli.getCpf());
                    break;
                }
                case 3: {
                    System.out.println("\n" + cli.getTelefone());
                    break;
                }
                case 4: {
                    System.out.println("\n" + cli.getEndereco());
                    break;
                }
                case 5: {
                    System.out.println("\n" + cli.getFilme());
                    break;
                }
            }

            System.out.println("\nDigite 0 para sair e 1 para voltar...");
            int n = ler.nextInt();

            if (n == 0){
                System.out.println("\nSaindo...");
                break;
            }
        }
    }

    public static void editarCliente(Cliente cli){
        String nome, cpf, tel, endereco;

        Scanner ler = new Scanner(System.in);

        while(true) {
            // menu
            System.out.println("\n|-------| MENU |-------|");
            System.out.println("| 1 - Editar Nome      |");
            System.out.println("| 2 - Editar Cpf       |");
            System.out.println("| 3 - Editar Telefone  |");
            System.out.println("| 4 - Editar Endereço  |");
            System.out.println("| 5 - Todos os dados   |");
            System.out.println("|----------------------|");
            int menu = ler.nextInt();

            switch (menu) {
                case 1: {
                    ler.nextLine();
                    System.out.println("Insira o novo nome:");
                    nome = ler.nextLine();
                    cli.setNome(nome);
                    System.out.println("\nO novo nome é: "+cli.getNome());
                    break;
                }
                case 2: {
                    ler.nextLine();
                    System.out.println("Insira o novo cpf:");
                    cpf = ler.nextLine();
                    cli.setCpf(cpf);
                    System.out.println("\nO novo cpf é: "+cli.getCpf());
                    break;
                }
                case 3: {
                    ler.nextLine();
                    System.out.println("Insira o novo telefone:");
                    tel = ler.nextLine();
                    cli.setTelefone(tel);
                    System.out.println("\nO novo telefone é: "+cli.getTelefone());
                    break;
                }
                case 4: {
                    ler.nextLine();
                    System.out.println("Insira o novo endereço:");
                    endereco = ler.nextLine();
                    cli.setEndereco(endereco);
                    System.out.println("\nO novo endereço é: "+cli.getEndereco());
                    break;
                }
                case 5:{
                    System.out.println("\nSeus novos dados são:");
                    System.out.println("\nNome: "+cli.getNome()+",");
                    System.out.println("CPF: "+cli.getCpf()+",");
                    System.out.println("Telefone: "+cli.getTelefone()+",");
                    System.out.println("Endereço: "+cli.getEndereco()+",");

                }
            }

            System.out.println("\nDigite 0 para sair e 1 para voltar...");
            int n = ler.nextInt();

            if (n == 0){
                System.out.println("\nSaindo...");
                break;
            }
        }
    }
}