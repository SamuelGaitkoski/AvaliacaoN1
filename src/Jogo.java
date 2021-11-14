
public class Jogo {

    public String compararValores(int escolhaUsuario, int numeroComputador) {

        if(numeroComputador == escolhaUsuario) {
            return "Empate!";
        } else if (escolhaUsuario > numeroComputador) {
            return "Você venceu!";
        } else {
            return "Seu oponente venceu!";
        }
    }
}
