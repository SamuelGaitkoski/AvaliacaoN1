
public class Jogo {

    public String verificarEscolhas(int escolhaUsuario, int numeroComputador) {
        if(escolhaUsuario == 1 && numeroComputador == 1) {
            return "Empate";
        }

        if(escolhaUsuario == 1 && numeroComputador == 2) {
            return "Seu oponente venceu!";
        }

        if(escolhaUsuario == 1 && numeroComputador == 3) {
            return "Você venceu!";
        }

        if(escolhaUsuario == 2 && numeroComputador == 1) {
            return "Você venceu!";
        }

        if(escolhaUsuario == 2 && numeroComputador == 2) {
            return "Empate";
        }

        if(escolhaUsuario == 2 && numeroComputador == 3) {
            return "Seu oponente venceu!";
        }

        if(escolhaUsuario == 3 && numeroComputador == 1) {
            return "Seu oponente venceu!";
        }

        if(escolhaUsuario == 3 && numeroComputador == 2) {
            return "Você venceu!";
        } else {
            return "Empate";
        }

    }
}
