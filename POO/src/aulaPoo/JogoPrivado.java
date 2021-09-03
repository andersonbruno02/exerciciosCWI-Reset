package aulaPoo;

public class JogoPrivado {
    public static void main(String[] args) {

        MarioPrivado jogador2 = new MarioPrivado();
        jogador2.nome = "Luigi";
        jogador2.altura = "Alto";
        jogador2.cor = "Verde";
        jogador2.vidas = 5;

        jogador2.status();
        jogador2.superPoderes();
        jogador2.morrer();
        jogador2.continuar();

    }
}
