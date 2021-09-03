package aulaPoo;

public class Jogo {

    public static void main(String[] args) {

        Mario jogador1 = new Mario();
        jogador1.nome = "Mario";
        jogador1.altura = "Baixo";
        jogador1.cor = "Vermelho";
        jogador1.vidas = 5;
        jogador1.vivo = true;

        jogador1.status();
        jogador1.superPoderes();
    }
}
