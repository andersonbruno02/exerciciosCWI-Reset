package aula.variavel;

import java.util.Scanner;

public class Variavel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome, idade, altura, e se tem pet");
        String nome = scan.nextLine();
        int idade = scan.nextInt();
        float altura = scan.nextFloat();
        boolean temPet = scan.hasNextBoolean();

        System.out.println("Valores Inseridos:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Tem pet: " + temPet);
    }
}

