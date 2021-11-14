import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Bem-vindo ao jogo de pedra, papel e tesoura");
        System.out.println();
        System.out.println("Escolha: 1-Pedra 2-Papel 3-Tesoura");
        var escolhaUsuario = teclado.nextInt();

        if (escolhaUsuario == 1) {
            numero = 1;
        } else if (escolhaUsuario == 2) {
            numero = 2;
        } else if (escolhaUsuario == 3) {
            numero = 3;
        } else {
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        int min = 1;
        int max = 3;

        Random randon = new Random();
        int numeroComputador = randon.nextInt(max) + min;

        Jogo jogo = new Jogo();
        System.out.println();
        System.out.printf("Resultado da rodada: %s", jogo.compararValores(escolhaUsuario, numeroComputador));

        System.out.println();
        System.out.printf("Peso da sua escolha: %d", numero);
        System.out.println();
        System.out.printf("Peso da escolha do seu oponente: %d", numeroComputador);


        teclado.close();
    }
}
