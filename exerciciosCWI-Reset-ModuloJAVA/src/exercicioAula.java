import java.util.Scanner;

public class exercicioAula {
    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite quanto você ganha por hora: ");
        double valorPorHora = lerTeclado.nextDouble();
        System.out.println("Digite quantas horas você trabalhou: ");
        double horasTrabalhadas = lerTeclado.nextDouble();
        System.out.println("Você recebeu: " + (valorPorHora*horasTrabalhadas));

    }
}
