package aulaPoo;

public class JogoPrivado {
    public static void main(String[] args) {

        MarioPrivado jogador1 = new MarioPrivado();
        MarioPrivado jogador2 = new MarioPrivado("Luigi", 1.75, 40, 100);
        jogador1.perderEstamina();
        jogador1.crescer();
        jogador1.status();

        jogador2.perderEstamina();
        jogador2.ganharEstamina();
        jogador2.crescer();
        jogador2.status();

    }
}
