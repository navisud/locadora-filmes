import com.locadora.Cliente;
import com.locadora.Filme;
import com.locadora.Gerente;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int menu, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira 0 para 'cadastrar cliente' ou 1 para 'cadastrar filme':");
        menu = scan.nextInt();

        while(true){

            if (menu == 0) {
                Cliente cliente = Gerente.cadastrarCliente();
                Gerente.editarCliente(cliente);
                Gerente.consultarCliente(cliente);
            }
            else {
                Filme filme = Gerente.cadastrarFilme();
                Gerente.consultarFilme(filme);
                Gerente.editarFilme(filme);
            }

            System.out.println("Insira 0 para 'cadastrar cliente', 1 para 'cadastrar filme' ou 2 para sair:");
            n = scan.nextInt();
            scan.nextLine();

            if (n == 2){
                System.out.println("Saindo...");
                break;
            }

        // adicionar os clientes e filmes em um arraylist
        }
    }
}
