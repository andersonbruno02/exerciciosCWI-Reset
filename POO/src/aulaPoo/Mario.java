package aulaPoo;

import java.util.Arrays;

public class Mario {

    String nome;
    String altura;
    String cor;
    boolean vivo;
    int vidas;
    String[] poderes = {"Super Pulo","Giro da Morte"};

    void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Altura: " + this.altura);
        System.out.println("Cor: " + this.cor);
        System.out.println("Vivo: " + this.vivo);
        System.out.println("Vidas: " + this.vidas);
    }

    void superPoderes() {
        System.out.println("Poderes:");
        for (String poder: this.poderes) {
            System.out.println(poder);
        }
    }


}
