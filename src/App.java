import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
        String opcao = "", escolhaComputador = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Bem-vindo ao jogo de pedra, papel e tesoura");
        System.out.println();
        System.out.println("Escolha: 1-Pedra 2-Papel 3-Tesoura");
        var escolhaUsuario = teclado.nextInt();

        if (escolhaUsuario == 1) {
            opcao = "Pedra";
        } else if (escolhaUsuario == 2) {
            opcao = "Papel";
        } else if (escolhaUsuario == 3) {
            opcao = "Tesoura";
        } else {
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        int min = 1;
        int max = 3;

        Random randon = new Random();
        int numeroComputador = randon.nextInt(max) + min;

        if (numeroComputador == 1) {
            escolhaComputador = "Pedra";
        } else if (numeroComputador == 2) {
            escolhaComputador = "Papel";
        } else {
            escolhaComputador = "Tesoura";
        } 

        Jogo jogo = new Jogo();
        System.out.println();
        System.out.printf("Resultado da rodada: %s", jogo.verificarEscolhas(escolhaUsuario, numeroComputador));

        System.out.println();
        System.out.printf("Sua escolha: %s", opcao);
        System.out.println();
        System.out.printf("Escolha do seu oponente: %s", escolhaComputador);


        teclado.close();
    }
}
